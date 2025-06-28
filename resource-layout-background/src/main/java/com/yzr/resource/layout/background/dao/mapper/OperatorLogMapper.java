package com.yzr.resource.layout.background.dao.mapper;

import com.yzr.resource.layout.background.dao.entity.OperatorLogEntity;
import com.yzr.resource.layout.background.dao.entity.OperatorLogSelectEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OperatorLogMapper {
    /**
     * 插入操作日志
     * @param logEntity
     */
    void insertOperatorLog(OperatorLogEntity logEntity);

    /**
     * 查询操作日志
     * @param selectEntity
     * @return
     */
    List<OperatorLogEntity> selectOperatorLog(OperatorLogSelectEntity selectEntity);

    /**
     * 查询操作日志数量
     * @param selectEntity
     * @return
     */
    Integer selectOperatorLogCount(OperatorLogSelectEntity selectEntity);
}
