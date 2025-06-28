package com.yzr.resource.layout.background.dao;

import com.yzr.resource.layout.background.dao.entity.OperatorLogEntity;
import com.yzr.resource.layout.background.dao.entity.OperatorLogSelectEntity;

import java.util.List;


public interface OperatorLogArea {
    /**
     * 增加后台操作日志记录
     * @param logEntity
     */
    void addOperatorLog(OperatorLogEntity logEntity);

    /**
     * 条件查询后台操作日志记录
     * @param selectEntity
     * @return
     */
    List<OperatorLogEntity> findOperatorLog(OperatorLogSelectEntity selectEntity);

    /**
     * 条件查询后台操作日志记录数量
     * @param selectEntity
     * @return
     */
    Integer findOperatorLogCount(OperatorLogSelectEntity selectEntity);
}
