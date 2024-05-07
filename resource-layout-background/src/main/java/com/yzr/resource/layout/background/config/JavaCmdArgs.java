package com.yzr.resource.layout.background.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JavaCmdArgs {
    //在服务启动之前获取命令行 以--开头的输入参数
    public JavaCmdArgs(ApplicationArguments arguments){
        boolean testReadCmd = arguments.containsOption("testReadCmd");
        if (testReadCmd) {
            //获取=赋值的参数值
            List<String> testReadCmd1 = arguments.getOptionValues("testReadCmd");
            System.out.println(testReadCmd1);
            // if run with "--testReadCmd=testReadCmd" prints ["testReadCmd"]
        }
        System.out.println("----");
        boolean testReadCmd2 = arguments.containsOption("testReadCmd2");
        if (testReadCmd2){
            //获取 空格分隔 的参数值
            List<String> nonOptionArgs = arguments.getNonOptionArgs();
            System.out.println(nonOptionArgs);
            // if run with "--testReadCmd2 testReadCmd2" prints ["testReadCmd2"]

        }

    }
}
