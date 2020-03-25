package com.itlebron.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itlebron.dao.StudentMapper;
import com.itlebron.entity.Student;
import com.itlebron.service.StudentService;
import com.itlebron.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentVo> findAll() {
        return studentMapper.findAll();
    }
}
