package com.example.nacosspringbootcloudserverdiscover;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/3/28
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 创建服务
 */
@RestController
public class NacosProducerController {


    @Value("${server.port}")
    private Integer port;

    /**
     * 服务接口
     * @param name
     * @return
     */
    @RequestMapping("/hello")
    public String sayHello(@RequestParam("name")String name) {
        return "hello ---> "+name+" port -->"+port;
    }
}