package com.example.demo.controller;


import com.example.demo.common.Result;
import com.example.demo.mapper.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


//@RestController的意思是表示自己为返回json的控制器
@RestController
@RequestMapping("/echarts")//@RequestMapping是usercontroller统一的路由
public class echartController {





    @Resource//引入Mapper的userMapper
    BooksYearRatingMapper booksYearRatingMapper;
    @Resource
    EchartDigitalReadingRatingMapper echartDigitalReadingRatingMapper;
    @Resource
    EchartDigitalReadingAgeRatingMapper echartDigitalReadingAgeRatingMapper;
    @Resource
    EchartComprehensivrReadingRatingMapper echartComprehensivrReadingRatingMapper;
    @Resource
    EchartPersonalReadingSatisfactionMapper echartPersonalReadingSatisfactionMapper;
    @Resource
    EchartReadingActivitySatisfactionMapper echartReadingActivitySatisfactionMapper;
    @Resource
    EchartReadingParticipationRateMapper echartReadingParticipationRateMapper;
    @Resource
    EchartReadingPlaceSatisfactionMapper echartReadingPlaceSatisfactionMapper;
    @Resource
    EchartReadingSpaceUtilizationRateMapper echartReadingSpaceUtilizationRateMapper;

    @GetMapping("/echart_ReadingSpaceUtilizationRate")
    public Result<?> echartReadingSpaceUtilizationRate() {
        return Result.success(echartReadingSpaceUtilizationRateMapper.selectList(null));
    }

    @GetMapping("/echart_ReadingPlaceSatisfaction")
    public Result<?> echartReadingPlaceSatisfaction() {
        return Result.success(echartReadingPlaceSatisfactionMapper.selectList(null));
    }
    @GetMapping("/echart_ReadingParticipationRate")
    public Result<?> echartReadingParticipationRate() {
        return Result.success(echartReadingParticipationRateMapper.selectList(null));
    }
    @GetMapping("/echart_ReadingActivitySatisfaction")
    public Result<?> echartReadingActivitySatisfaction() {
        return Result.success(echartReadingActivitySatisfactionMapper.selectList(null));
    }
    @GetMapping("/echart_PersonalReadingSatisfaction")
    public Result<?> echartPersonalReadingSatisfaction() {
        return Result.success(echartPersonalReadingSatisfactionMapper.selectList(null));
    }

    @GetMapping("/echart_rating")
    public Result<?> echartRating() {

        return Result.success(booksYearRatingMapper.selectList(null));
    }

    @GetMapping("/echart_ComprehensivrReadingRating")
    public Result<?> echartComprehensivrReadingRating() {
        return Result.success(echartComprehensivrReadingRatingMapper.selectList(null));
    }
    @GetMapping("/echart_DigitalReadingAgeRating")
    public Result<?> echartDigitalReadingAgeRating() {
        return Result.success(echartDigitalReadingAgeRatingMapper.selectList(null));
    }
    @GetMapping("/echart_DigitalReadingRating")
    public Result<?> echartDigitalReadingRating() {
        return Result.success(echartDigitalReadingRatingMapper.selectList(null));
    }


}
