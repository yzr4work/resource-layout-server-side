package com.yzr.resource.layout.background.controller;

import com.yzr.resource.layout.background.controller.vo.overall.ReqPageWarp;
import com.yzr.resource.layout.background.controller.vo.overall.ReqParamWarp;
import com.yzr.resource.layout.background.controller.vo.overall.RespPageWarp;
import com.yzr.resource.layout.background.controller.vo.overall.RespWarp;
import com.yzr.resource.layout.background.controller.vo.user.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/bg/user")
public class BgUserController {
    private final Logger LOGGER = LoggerFactory.getLogger(FirstController.class);

    /**
     * 后台用户创建
     * @param reqParamWarp
     * @return
     */
    @PostMapping("/create")
    public RespWarp<BgUserCreateRespVo> bgUserCreate(ReqParamWarp<BgUserCreateReqVo> reqParamWarp){
        BgUserCreateReqVo reqVo =  reqParamWarp.getParam();
        LOGGER.info("bgUserCreate rev param : {}", reqVo.toString());
        BgUserCreateRespVo respVo = new BgUserCreateRespVo();
        respVo.setResult(true);
        respVo.setBgUserName(reqVo.getBgUserName());
        respVo.setBgUserAccount(reqVo.getBgUserAccount());
        return RespWarp.SUCCESS(respVo);
    }

    /**
     * 后台用户注销
     * @param reqParamWarp
     * @return
     */
    @PostMapping("/delete")
    public RespWarp<BgUserDeleteRespVo> bgUserDelete(ReqParamWarp<BgUserDeleteReqVo> reqParamWarp){
        BgUserDeleteReqVo reqVo = reqParamWarp.getParam();
        LOGGER.info("bgUserDelete rec param : {}",reqVo.toString());
        BgUserDeleteRespVo respVo = new BgUserDeleteRespVo();
        respVo.setResult(true);
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
        LOGGER.info("bgUserLogin rec param : {}",reqVo.toString());
        BgUserLoginRespVo respVo = new BgUserLoginRespVo();
        respVo.setBgUserToken("uyjbe");
        respVo.setBgUserId("54548");
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
        LOGGER.info("bgUserSignOut rec param : {}",reqVo.toString());
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
        LOGGER.info("bgUserList rec param : {}",reqVo.toString());
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
     */
    @PostMapping("/info")
    public RespWarp<BgUserInfoRespVo> bgUserInfo(ReqParamWarp<BgUserInfoReqVo> reqParamWarp){
        BgUserInfoReqVo reqVo = reqParamWarp.getParam();
        LOGGER.info("bgUserInfo rec param : {}",reqVo.toString());
        BgUserInfoRespVo respVo = new BgUserInfoRespVo();
        respVo.setBgUserId("1");
        respVo.setBgUserName("1");
        respVo.setBgUserAccount("1");
        respVo.setPassword("123456");
        return RespWarp.SUCCESS(respVo);
    }
}