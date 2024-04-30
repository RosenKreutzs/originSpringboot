package com.example.demo.controller;

import com.example.demo.common.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/RedisController")
public class RedisController {
    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/setName")
    public  boolean setName(){
        return redisUtil.hset("myhash","name","村民们");
    }
    @GetMapping("/getName")
    public Map<String,Object> getName(){
        Map<String,Object> resultMap=new HashMap<>();
        resultMap.put("name",redisUtil.hget("myhash","name"));
        return resultMap;
    }

}
