package com.yzr.resource.layout.background.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperatorMapper {
    void insertOperatorLog();
    List selectOperatorLog();
}
