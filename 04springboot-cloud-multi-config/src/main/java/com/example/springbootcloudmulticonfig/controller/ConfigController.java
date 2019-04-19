package com.example.springbootcloudmulticonfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${nacos.config}")
    private String testName;


    @RequestMapping("/get")
    public String get() {
        return testName;
    }
}
