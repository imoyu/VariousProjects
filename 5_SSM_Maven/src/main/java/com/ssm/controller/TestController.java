package com.ssm.controller;

import com.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService service;

    @ResponseBody
    @RequestMapping("map")
    private Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("jii", "momomo");
        map.put("oko", "231vc");
        map.put("kkk", "xxxccc");
        return map;
    }

    @RequestMapping("hello")
    private String getHelloJsp() {
        return "hello";
    }

    @RequestMapping("db/test")
    @ResponseBody
    public String test() {
        return service.test();
    }

//    @RequestMapping("db/test")
//    @ResponseBody
//    public String add(@RequestBody(required = false) TableForSSM entity) {
//        return service.test();
//    }
}
