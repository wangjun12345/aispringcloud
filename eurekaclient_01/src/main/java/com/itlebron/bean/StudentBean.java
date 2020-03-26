package com.itlebron.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class StudentBean {
    private Integer id;
    private String name;
    private String sex;
}
