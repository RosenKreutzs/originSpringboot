package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("movies")
@Data
public class Movies {
    @TableId(type = IdType.AUTO)
    private String movieid;
    private String title;
    private String genres;
    private String year;
}
