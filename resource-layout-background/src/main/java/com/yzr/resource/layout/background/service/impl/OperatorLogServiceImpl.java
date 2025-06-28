package com.yzr.resource.layout.background.service.impl;

import com.yzr.resource.layout.background.dao.OperatorLogArea;
import com.yzr.resource.layout.background.dao.entity.OperatorLogEntity;
import com.yzr.resource.layout.background.dao.entity.OperatorLogSelectEntity;
import com.yzr.resource.layout.background.service.OperatorLogService;
import com.yzr.resource.layout.background.service.dto.operatorLog.CreateOperatorLogDto;
import com.yzr.resource.layout.background.service.dto.operatorLog.OperatorLogInfoListDto;
import com.yzr.resource.layout.background.service.dto.operatorLog.OperatorLogInfoListResultDto;
import com.yzr.resource.layout.background.service.dto.overall.PageParamDtoWarp;
import com.yzr.resource.layout.background.service.dto.overall.PageReturnDtoWarp;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OperatorLogServiceImpl implements OperatorLogService {
    final private OperatorLogArea logArea;

    public OperatorLogServiceImpl(OperatorLogArea logArea) {
        this.logArea = logArea;
    }

    /**
     * 添加后台操作日志
     * @param createOperatorLogDto 添加后台操作日志记录参数
     */
    @Override
    public void addOperatorLog(CreateOperatorLogDto createOperatorLogDto) {
        OperatorLogEntity logEntity = new OperatorLogEntity();
        logEntity.setBgUserId(createOperatorLogDto.getBgUserId());
        logEntity.setBgUserAccount(createOperatorLogDto.getBgUserAccount());
        logEntity.setLogType(createOperatorLogDto.getLogType());
        logEntity.setParam(createOperatorLogDto.getParam());
        logEntity.setResult(createOperatorLogDto.getResult());
        logArea.addOperatorLog(logEntity);
    }

    /**
     * 分页条件查询后台操作日志
     *
     * @param listParam 分页查询条件参数
     * @return
     */
    @Override
    public PageReturnDtoWarp<OperatorLogInfoListResultDto> listOperatorLog(PageParamDtoWarp<OperatorLogInfoListDto> listParam) {
        OperatorLogSelectEntity selectEntity = listParamConversionSelectEntity(listParam);
        List<OperatorLogEntity> logEntityList = logArea.findOperatorLog(selectEntity);
        PageReturnDtoWarp<OperatorLogInfoListResultDto> result = new PageReturnDtoWarp<>();
        if (CollectionUtils.isEmpty(logEntityList)){
            result.setCount(0);
            result.setList(null);
        }else {
            result.setCount(logArea.findOperatorLogCount(selectEntity));
            result.setList(logEntityList.stream()
                    .map(OperatorLogServiceImpl::entityConversionResultDto)
                    .collect(Collectors.toList()));
        }
        return result;
    }

    private static OperatorLogInfoListResultDto entityConversionResultDto(OperatorLogEntity entity) {
        OperatorLogInfoListResultDto dto = new OperatorLogInfoListResultDto();
        dto.setLogId(entity.getLogId());
        dto.setBgUserId(entity.getBgUserId());
        dto.setBgUserAccount(entity.getBgUserAccount());
        dto.setLogType(entity.getLogType());
        dto.setParam(entity.getParam());
        dto.setResult(entity.getResult());
        dto.setCreateTime(entity.getCreateTime());
        return dto;
    }

    private static OperatorLogSelectEntity listParamConversionSelectEntity(PageParamDtoWarp<OperatorLogInfoListDto> listParam) {
        OperatorLogInfoListDto param = listParam.getParam();
        OperatorLogSelectEntity selectEntity = new OperatorLogSelectEntity();
        selectEntity.setBeginLogId(listParam.getLastId());
        selectEntity.setOperatorAccount(param.getOperatorAccount());
        selectEntity.setOperatorId(param.getOperatorId());
        selectEntity.setBeginTime(param.getBeginTime());
        selectEntity.setEndTime(param.getEndTime());
        selectEntity.setLogType(param.getLogType());
        selectEntity.setCount(listParam.getPageSize());
        return selectEntity;
    }
}
