package com.mybatisplus.jdkproxy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/mybatis")
@Slf4j
public class MybatisController {

    @Autowired //mybatis用了动态代理来调用映射文件中的方法
    UserMapper userMapper;


    @GetMapping("/test")
    public void test() {
        log.info("userMapper  {}",userMapper.getClass());
        log.info("test1  {}",userMapper.delete("1000"));
    }

}
