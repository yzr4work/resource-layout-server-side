package com.yzr.resource.layout.background.dao.areaImpl;

import com.alibaba.fastjson2.JSON;
import com.yzr.resource.layout.background.dao.BgUserArea;
import com.yzr.resource.layout.background.dao.entity.BgUserEntity;
import com.yzr.resource.layout.background.dao.mapper.BgUserMapper;
import com.yzr.resource.layout.tool.RedisLettuceTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BgUserAreaImpl implements BgUserArea {

    private final BgUserMapper bgUserMapper;

    @Autowired
    private RedisLettuceTool redisTool;

    public BgUserAreaImpl(BgUserMapper bgUserMapper) {
        this.bgUserMapper = bgUserMapper;
    }

    /**
     * 创建后台用户
     * @param bgUser 后台用户实体对象
     * @return 后台用户ID
     */
    @Override
    public String createBgUser(BgUserEntity bgUser) {
        bgUserMapper.createBgUser(bgUser);
        return bgUser.getBgUserId();
    }

    /**
     * 删除后台用户
     *
     * @param bgUser 后台用户数据对象
     * @return 是否删除成功
     */
    @Override
    public Boolean deleteBgUser(BgUserEntity bgUser) {
        Integer effectNum = bgUserMapper.deleteBgUser(bgUser);
        if (effectNum != null && effectNum == 1){
            //删除相关缓存
            return true;
        }
        return false;
    }

    /**
     * 查询后台用户
     *
     * @param bgUser 查询条件
     * @return 查询结果
     */
    @Override
    public BgUserEntity findBgUser(BgUserEntity bgUser) {
        return bgUserMapper.findBgUser(bgUser);
    }

    /**
     * 缓存token 和 后台用户信息
     *
     * @param token  token
     * @param bgUser 后台用户信息
     */
    @Override
    public void cacheTokenBgUser(String token, BgUserEntity bgUser) {
        //有效期7天
        redisTool.set(token, JSON.toJSONString(bgUser), 7 * 24 * 3600 );
        redisTool.set(bgUser.getBgUserId(),token, 7 * 24 * 3600);
    }

    /**
     * 根据token获取用户信息
     *
     * @param token
     * @return
     */
    @Override
    public BgUserEntity getBgUserByToken(String token) {
        Object strFormCache = redisTool.get(token);
        if (strFormCache == null){
            return null;
        }
        return JSON.parseObject((String) strFormCache, BgUserEntity.class);
    }
}
