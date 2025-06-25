package com.yzr.resource.layout.background.dao.mapper;

import com.yzr.resource.layout.background.dao.entity.BgUserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BgUserMapper {

    Integer createBgUser(BgUserEntity bgUser);

    Integer deleteBgUser(BgUserEntity bgUser);
}
