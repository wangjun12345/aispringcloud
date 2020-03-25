package com.itlebron.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* 学生
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("student")
public class Student {
    private Long id;
    private String name;
    private String sex;
}
