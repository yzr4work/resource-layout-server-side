package com.yzr.resource.layout.background.dao;

import com.yzr.resource.layout.background.dao.entity.BgUserEntity;


public interface BgUserArea {
    /**
     * 创建后台用户
     * @param bgUser
     * @return
     */
    String createBgUser(BgUserEntity bgUser);

    /**
     * 删除后台用户
     * @param bgUser
     * @return
     */
    Boolean deleteBgUser(BgUserEntity bgUser);
}
