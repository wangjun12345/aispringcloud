package com.itlebron.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itlebron.vo.StudentVo;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface StudentMapper extends BaseMapper {

    List<StudentVo> findAll();
}


