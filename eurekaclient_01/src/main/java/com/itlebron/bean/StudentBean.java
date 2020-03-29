package com.itlebron.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class StudentBean implements Serializable {
    private Integer id;
    private String name;
    private String sex;
}
