package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("sanitationman_table")
@Data
public class SanitationmanTable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String birthday;
    private String sex;
    private String care;
    private String career;
    private String workingState;
    private String administrativeUnit;
    private String vaccineState;
    private String socialSecurity;
}
