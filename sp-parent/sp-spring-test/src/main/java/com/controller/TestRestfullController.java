package com.controller;

import com.bean.TestObj;
import com.bean.UserEntity;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("/user")
@Slf4j
public class TestRestfullController {



    @GetMapping("/{id}")
    public void test1(@PathVariable("id") String id) {
        log.info("查询用户");
    }

    @PostMapping
    public void test2(@RequestBody UserEntity userEntity) {
        log.info("创建用户");
    }

    @PutMapping("/{id}")
    public void test3(@RequestBody UserEntity userEntity) {
        log.info("修改用户");
    }

    @DeleteMapping("/{id}")
    public void test4(@PathVariable("id") String id) {
        log.info("删除用户");
    }
}
