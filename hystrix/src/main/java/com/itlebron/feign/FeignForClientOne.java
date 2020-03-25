package com.itlebron.feign;

import com.itlebron.feign.Impl.FeignError;
import com.itlebron.vo.StudentVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "client-01", fallback = FeignError.class)
public interface FeignForClientOne {

    @GetMapping("/student/findAll")
    public List<StudentVo> findAll();

    @GetMapping("/student/port")
    public String port();
}
