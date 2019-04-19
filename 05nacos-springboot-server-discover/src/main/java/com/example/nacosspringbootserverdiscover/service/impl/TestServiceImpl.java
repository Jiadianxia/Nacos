package com.example.nacosspringbootserverdiscover.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.example.nacosspringbootserverdiscover.service.TestService;


/**
 * <p>
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/3/22
 */
@Service
public class TestServiceImpl implements TestService {

    @NacosValue(value = "${nacos.config}", autoRefreshed = true)
    private String name;

    @Override
    public String info() {
        return name;
    }
}
