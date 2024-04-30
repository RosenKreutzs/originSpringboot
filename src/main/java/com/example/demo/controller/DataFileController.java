package com.example.demo.controller;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.Result;
import com.example.demo.entity.DataFile;
import com.example.demo.mapper.DataFileMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


//@RestController的意思是表示自己为返回json的控制器
@RestController
@RequestMapping("/dataFile")//@RequestMapping是usercontroller统一的路由
public class DataFileController {
    @Resource//引入Mapper的userMapper
    DataFileMapper dataFileMapper;


    @GetMapping(value = "/findPage")
    public Result<?> findPage(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "10") Integer pageSize,@RequestParam(defaultValue = "") String search){
        //pageNum是当前页;pageSize是一页有多少条数据;search是查询的关键字(defaultValue是设置默认值)
        LambdaQueryWrapper<DataFile> wrapper=Wrappers.<DataFile>lambdaQuery();//sql条件的执行对象
        if (StrUtil.isNotBlank(search)){//StrUtil.isNotBlank(search)是hutool依赖用来帮助判断参数是否为空的
            wrapper.like(DataFile::getName,search);
        }
        Page<DataFile> dataFilePage= dataFileMapper.selectPage(new Page<>(pageNum,pageSize), wrapper);
        //selectPage需要Page对象和sql执行对象
        //new Page<>(pageNum,pageSize)//分页对象
        //Wrappers.<User>lambdaQuery().like(User::getNickName,search)//sql执行对象
        // User::getNickName是User.getNickName的变形
        return Result.success(dataFilePage);//Result.success(变量名)//用返回变量
    }

}
