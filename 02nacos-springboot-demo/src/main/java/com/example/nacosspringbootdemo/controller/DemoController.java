package com.example.nacosspringbootdemo.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/3/21
 */
@RestController
@RequestMapping("config")
public class DemoController {


    @NacosValue(value = "${nacos.config}", autoRefreshed = true)
    private String nacosConfig;

    @GetMapping(value = "get")
    public String getInfo(){
        return nacosConfig;
    }
}
