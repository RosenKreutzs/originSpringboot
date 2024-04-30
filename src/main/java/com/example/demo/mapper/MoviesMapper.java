package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Movies;

import java.util.List;

public interface MoviesMapper extends BaseMapper<Movies> {
    /**
     *
     * @return
     */
    List<Movies> getall();
}