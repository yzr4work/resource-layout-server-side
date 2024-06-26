package com.yzr.resource.layout.background.dao;

import com.yzr.resource.layout.background.dao.entity.BgUserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface BgUserArea {
    String createBgUser(BgUserEntity bgUser);
}
