package com.example.nacosspringbootserverdiscover.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("discovery")
public class DiscoveryController {


    @RequestMapping(value = "/get", method = GET)
    @ResponseBody
    public String get(@RequestParam String serviceName) {
        return "hello";
    }
}
