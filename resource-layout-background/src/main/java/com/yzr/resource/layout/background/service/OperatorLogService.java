package com.yzr.resource.layout.background.service;

import com.yzr.resource.layout.background.service.dto.operatorLog.CreateOperatorLogDto;
import com.yzr.resource.layout.background.service.dto.operatorLog.OperatorLogInfoListDto;
import com.yzr.resource.layout.background.service.dto.operatorLog.OperatorLogInfoListResultDto;
import com.yzr.resource.layout.background.service.dto.overall.PageParamDtoWarp;
import com.yzr.resource.layout.background.service.dto.overall.PageReturnDtoWarp;

public interface OperatorLogService {
    /**
     * 添加后台操作日志
     * @param createOperatorLogDto 添加后台操作日志记录参数
     */
    void addOperatorLog(CreateOperatorLogDto createOperatorLogDto);

    /**
     * 分页条件查询后台操作日志
     * @param listParam 分页查询条件参数
     * @return
     */
    PageReturnDtoWarp<OperatorLogInfoListResultDto> listOperatorLog(PageParamDtoWarp<OperatorLogInfoListDto> listParam);
}
