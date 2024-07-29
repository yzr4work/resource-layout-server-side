package com.yzr.resource.layout.background.controller;

import com.yzr.resource.layout.background.controller.vo.overall.ReqParamWarp;
import com.yzr.resource.layout.background.controller.vo.overall.RespWarp;
import com.yzr.resource.layout.background.controller.vo.first.FirstReqParam;
import com.yzr.resource.layout.background.controller.vo.first.FirstResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/first")
public class FirstController {
    private final Logger LOGGER = LoggerFactory.getLogger(FirstController.class);
    @PostMapping("/firstMethod")
    public RespWarp<FirstResp> firstMethod(@RequestBody ReqParamWarp<FirstReqParam> reqParamWarp){
        LOGGER.info("firstMethod rev param : {}", reqParamWarp.getParam().toString());
        FirstResp resp = new FirstResp();
        resp.setMsg("hello world");
        return RespWarp.SUCCESS(resp);
    }
    @GetMapping("/index")
    public String index(){
        return "index2";
    }
}
