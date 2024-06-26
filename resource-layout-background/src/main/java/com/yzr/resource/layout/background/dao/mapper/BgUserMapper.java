package com.yzr.resource.layout.background.dao.mapper;

import com.yzr.resource.layout.background.dao.entity.BgUserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface BgUserMapper {

    Integer createBgUser(BgUserEntity bgUser);

}
