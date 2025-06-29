package com.yzr.resource.layout.background.dao.areaImpl;

import com.yzr.resource.layout.background.dao.BgUserArea;
import com.yzr.resource.layout.background.dao.entity.BgUserEntity;
import com.yzr.resource.layout.background.dao.mapper.BgUserMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BgUserAreaImpl implements BgUserArea {

    private final BgUserMapper bgUserMapper;

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
}
