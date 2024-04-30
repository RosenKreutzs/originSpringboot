package com.example.demo.controller;

import com.example.demo.entity.Movies;
import com.example.demo.mapper.MoviesMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {
    @Resource
    MoviesMapper moviesMapper;

    @GetMapping("getall")
    public List<?> a(){
//        List<Movies> getall = moviesMapper.selectList(null);
        List<Movies> getall = moviesMapper.getall();
        return getall;
    }
}
