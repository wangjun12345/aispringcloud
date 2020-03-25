package com.itlebron.feign.Impl;

import com.itlebron.feign.FeignForClientOne;
import com.itlebron.vo.StudentVo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FeignError implements FeignForClientOne {
    @Override
    public List<StudentVo> findAll() {
        return null;
    }

    @Override
    public String port() {
        return "暂时无法访问";
    }
}
