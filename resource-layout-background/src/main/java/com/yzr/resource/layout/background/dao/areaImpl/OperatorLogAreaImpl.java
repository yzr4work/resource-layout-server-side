package com.yzr.resource.layout.background.dao.areaImpl;

import com.yzr.resource.layout.background.dao.OperatorLogArea;
import com.yzr.resource.layout.background.dao.entity.OperatorLogEntity;
import com.yzr.resource.layout.background.dao.entity.OperatorLogSelectEntity;
import com.yzr.resource.layout.background.dao.mapper.OperatorLogMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OperatorLogAreaImpl implements OperatorLogArea {

    final private OperatorLogMapper logMapper;

    public OperatorLogAreaImpl(OperatorLogMapper logMapper) {
        this.logMapper = logMapper;
    }

    /**
     * 增加后台操作日志记录
     *
     * @param logEntity
     */
    @Override
    public void addOperatorLog(OperatorLogEntity logEntity) {
        logMapper.insertOperatorLog(logEntity);
    }

    /**
     * 查询后台操作日志记录
     *
     * @param selectEntity
     * @return
     */
    @Override
    public List<OperatorLogEntity> findOperatorLog(OperatorLogSelectEntity selectEntity) {
        return logMapper.selectOperatorLog(selectEntity);
    }

    /**
     * 条件查询后台操作日志记录数量
     *
     * @param selectEntity
     * @return
     */
    @Override
    public Integer findOperatorLogCount(OperatorLogSelectEntity selectEntity) {
        return logMapper.selectOperatorLogCount(selectEntity);
    }
}
