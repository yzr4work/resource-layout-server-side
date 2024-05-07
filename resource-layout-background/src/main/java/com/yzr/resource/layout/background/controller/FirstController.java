package com.yzr.resource.layout.background.controller;

import com.yzr.resource.layout.background.controller.vo.FirstReqParam;
import com.yzr.resource.layout.background.controller.vo.FirstResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

    Logger logger = LoggerFactory.getLogger(FirstController.class);
    @PostMapping("/firstMethod")
    public FirstResp firstMethod(@RequestBody FirstReqParam reqParam){
        logger.info("firstMethod rev param : {}", reqParam.toString());
        FirstResp resp = new FirstResp();
        resp.setMsg("hello world");
        return resp;
    }
}
