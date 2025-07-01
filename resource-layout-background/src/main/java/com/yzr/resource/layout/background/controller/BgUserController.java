package com.yzr.resource.layout.background.controller;

import com.alibaba.fastjson2.JSON;
import com.yzr.resource.laout.background.controller.vo.overall.*;
import com.yzr.resource.layout.background.controller.vo.operator.OperatorLogTypeEnum;
import com.yzr.resource.layout.background.controller.vo.user.*;
import com.yzr.resource.layout.background.service.BgUserService;
import com.yzr.resource.layout.background.service.OperatorLogService;
import com.yzr.resource.layout.background.service.dto.operatorLog.CreateOperatorLogDto;
import com.yzr.resource.layout.background.service.dto.user.*;
import com.yzr.resource.layout.tool.AESEncryptionTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/bg/user")
public class BgUserController {
    private final Logger LOGGER = LoggerFactory.getLogger(BgUserController.class);

    private final BgUserService userService;
    private final OperatorLogService logService;
    @Value("password.sk")
    private String secretKey;
    @Value("password.iv")
    private byte[] iv;

    public BgUserController(BgUserService userService, OperatorLogService logService) {
        this.userService = userService;
        this.logService = logService;
    }

    /**
     * 后台用户创建
     * @param reqParamWarp
     * @return
     */
    @PostMapping("/create")
    public RespWarp<BgUserCreateRespVo> bgUserCreate(ReqParamWarp<BgUserCreateReqVo> reqParamWarp){
        BgUserCreateReqVo reqVo =  reqParamWarp.getParam();
        BgUserCreateRespVo respVo = new BgUserCreateRespVo();
        try {
            //密码加密
            reqVo.setPassword(AESEncryptionTool.encrypt(reqVo.getPassword(), secretKey, iv));
        } catch (Exception e) {
            LOGGER.error("bgUserCreate encrypt error");
            return RespWarp.ERROR_FROM_CODE_ENUM(RespCodeEnum.SYSTEM_ERROR);
        }
        LOGGER.info("bgUserCreate rev param : {}", JSON.toJSONString(reqVo));
        CreateBgUserResultDto result = userService.createBgUser(conversionCreateReqVo2Dto(reqVo));
        respVo.setBgUserName(reqVo.getBgUserName());
        respVo.setBgUserAccount(reqVo.getBgUserAccount());
        addOperatorLog(reqParamWarp, OperatorLogTypeEnum.CREATE_BG_USER, result.getResultType());
        if (result.getResultType() == 1){
            respVo.setResult(true);
            return RespWarp.SUCCESS(respVo);
        }else {
            respVo.setResult(false);
            return RespWarp.BUSINESS_ERROR(respVo,result.getDesc());
        }


    }

    /**
     * 删除后台用户
     * @param reqParamWarp
     * @return
     */
    @PostMapping("/delete")
    public RespWarp<BgUserDeleteRespVo> bgUserDelete(ReqParamWarp<BgUserDeleteReqVo> reqParamWarp){
        BgUserDeleteReqVo reqVo = reqParamWarp.getParam();
        LOGGER.info("bgUserDelete rec param : {}",JSON.toJSONString(reqVo));
        BgUserDeleteRespVo respVo = new BgUserDeleteRespVo();
        DeleteBgUserDto deleteBgUserDto = new DeleteBgUserDto();
        deleteBgUserDto.setBgUserId(reqVo.getBgUserId());
        deleteBgUserDto.setBgUserAccount(reqVo.getBgUserAccount());
        DeleteBgUserResultDto delResult = userService.deleteBgUser(deleteBgUserDto);
        respVo.setResult(delResult.getResult());
        addOperatorLog(reqParamWarp, OperatorLogTypeEnum.DEL_BG_USER, delResult.getResult() ? 1 : 2);
        return RespWarp.SUCCESS(respVo);
    }

    /**
     * 后台用户登录
     * @param reqParamWarp
     * @return
     */
    @PostMapping("/login")
    public RespWarp<BgUserLoginRespVo> bgUserLogin(ReqParamWarp<BgUserLoginReqVo> reqParamWarp){
        BgUserLoginReqVo reqVo = reqParamWarp.getParam();
        LoginResultDto loginResultDto;
        //密码加密
        try {
            reqVo.setPassword(AESEncryptionTool.encrypt(reqVo.getPassword(), secretKey, iv));

            LOGGER.info("bgUserLogin rec param : {}", JSON.toJSONString(reqVo));
            loginResultDto = userService.login(conversionLoginReqVo2Dto(reqVo));
        }catch (Exception e){
            LOGGER.error("bgUserLogin encrypt error ");
            return RespWarp.ERROR_FROM_CODE_ENUM(RespCodeEnum.SYSTEM_ERROR);
        }
        if (loginResultDto == null){
            return RespWarp.ERROR_FROM_CODE_ENUM(RespCodeEnum.LOGIN_FAIL);
        }
        BgUserLoginRespVo respVo = new BgUserLoginRespVo();
        respVo.setBgUserToken(loginResultDto.getToken());
        respVo.setBgUserName(loginResultDto.getBgUserName());
        return RespWarp.SUCCESS(respVo);
    }

    /**
     * 后台用户登出
     * @param reqParamWarp
     * @return
     */
    @PostMapping("/signOut")
    public RespWarp<BgUserSignOutRespVo> bgUserSignOut(ReqParamWarp<BgUserSignOutReqVo> reqParamWarp){
        BgUserSignOutReqVo reqVo = reqParamWarp.getParam();
        LOGGER.info("bgUserSignOut rec param : {}",JSON.toJSONString(reqVo));
        BgUserSignOutRespVo respVo = new BgUserSignOutRespVo();
        respVo.setResult(true);
        return RespWarp.SUCCESS(respVo);
    }

    /**
     * 分页条件查询后台用户列表
     */
    @PostMapping("/list")
    public RespWarp<RespPageWarp<BgUserListRespVo>> bgUserList(ReqParamWarp<ReqPageWarp<BgUserListReqVo>> reqParamWarp){
        ReqPageWarp<BgUserListReqVo> reqVo = reqParamWarp.getParam();
        LOGGER.info("bgUserList rec param : {}",JSON.toJSONString(reqVo));
        RespPageWarp<BgUserListRespVo> resp = new RespPageWarp<>();
        ArrayList<BgUserListRespVo> bgUserList = new ArrayList<>();
        bgUserList.add(new BgUserListRespVo("1","1","1"));
        bgUserList.add(new BgUserListRespVo("2","2","2"));
        bgUserList.add(new BgUserListRespVo("3","3","3"));
        bgUserList.add(new BgUserListRespVo("4","4","4"));
        bgUserList.add(new BgUserListRespVo("5","5","5"));
        bgUserList.add(new BgUserListRespVo("6","6","6"));
        bgUserList.add(new BgUserListRespVo("7","7","7"));
        bgUserList.add(new BgUserListRespVo("8","8","8"));
        bgUserList.add(new BgUserListRespVo("9","9","9"));
        resp.setList(bgUserList);
        resp.setCount(9L);
        resp.setCurrentPage(1L);
        resp.setPageSize(10);
        return RespWarp.SUCCESS(resp);
    }

    /**
     * 查询后台用户详细信息
     * todo: 接口权限验证 只有管理员权限才能调用
     */
    @PostMapping("/info")
    public RespWarp<BgUserInfoRespVo> bgUserInfo(ReqParamWarp<BgUserInfoReqVo> reqParamWarp){
        BgUserInfoReqVo reqVo = reqParamWarp.getParam();
        LOGGER.info("bgUserInfo rec param : {}",JSON.toJSONString(reqVo));
        BgUserInfoRespVo respVo = new BgUserInfoRespVo();
        respVo.setBgUserId("1");
        respVo.setBgUserName("1");
        respVo.setBgUserAccount("1");
        respVo.setPassword("123456");
        return RespWarp.SUCCESS(respVo);
    }

    /**
     * 后台用户登录请求vo对象转换到dto对象
     * @param reqVo 后台用户登录请求vo对象
     * @return 后台用户登录dto对象
     */
    private static LoginDto conversionLoginReqVo2Dto(BgUserLoginReqVo reqVo) {
        LoginDto loginDto = new LoginDto();
        loginDto.setBgUserAccount(reqVo.getBgUserAccount());
        loginDto.setPassword(reqVo.getPassword());
        return loginDto;
    }


    /**
     * 创建用户请求vo对象转换到dto对象
     * @param reqVo 创建用户请求vo对象
     * @return 创建用户dto对象
     */
    private CreateBgUserDto conversionCreateReqVo2Dto(BgUserCreateReqVo reqVo){
        CreateBgUserDto dto = new CreateBgUserDto();
        dto.setBgUserName(reqVo.getBgUserName());
        dto.setBgUserAccount(reqVo.getBgUserAccount());
        dto.setPassword(reqVo.getPassword());
        return dto;
    }

    /**
     * 记录操作日志
     * @param reqParamWarp 请求对象
     * @param logType 日志类型
     * @param resultTypeCode 操作结果状态码
     */
    private void addOperatorLog(ReqParamWarp reqParamWarp, OperatorLogTypeEnum logType, Integer resultTypeCode) {
        CreateOperatorLogDto logDto = new CreateOperatorLogDto();
        logDto.setLogType(logType.getCode());
        logDto.setParam(reqParamWarp.getParam().toString());
        logDto.setBgUserId(reqParamWarp.getBgOperationUser().getBgUserId());
        logDto.setBgUserAccount(reqParamWarp.getBgOperationUser().getBgUserAccount());
        logDto.setResult(resultTypeCode);
        //记录操作日志
        logService.addOperatorLog(logDto);
    }
}
