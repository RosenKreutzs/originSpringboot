package com.example.demo.controller;


import com.example.demo.common.Result;
import com.example.demo.entity.SanitationmanTable;
import com.example.demo.mapper.SanitationmanTableMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


//@RestController的意思是表示自己为返回json的控制器
@RestController
@RequestMapping("/echart")//@RequestMapping是usercontroller统一的路由
public class SanitationmanTableController {
    @Resource//引入Mapper的userMapper
    SanitationmanTableMapper sanitationmanTableMapper;

    @GetMapping("/shows")//定义post的接口
    public Result<?> findTry() {
        List<SanitationmanTable> tryList = sanitationmanTableMapper.selectList(null);
        return Result.success(tryList);
    }
}
