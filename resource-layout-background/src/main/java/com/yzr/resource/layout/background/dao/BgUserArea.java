package com.yzr.resource.layout.background.dao;

import com.yzr.resource.layout.background.dao.entity.BgUserEntity;


public interface BgUserArea {
    /**
     * 创建后台用户
     * @param bgUser 创建参数
     * @return 后台用户ID
     */
    String createBgUser(BgUserEntity bgUser);

    /**
     * 删除后台用户
     * @param bgUser 删除条件
     * @return 删除结果
     */
    Boolean deleteBgUser(BgUserEntity bgUser);

    /**
     * 查询后台用户
     * @param bgUser 查询条件
     * @return 查询结果
     */
    BgUserEntity findBgUser(BgUserEntity bgUser);

    /**
     * 缓存token 和 后台用户信息
     * @param token token
     * @param bgUser 后台用户信息
     */
    void cacheTokenBgUser(String token , BgUserEntity bgUser);

    /**
     * 根据token获取用户信息
     * @param token
     * @return
     */
    BgUserEntity getBgUserByToken(String token);


}
