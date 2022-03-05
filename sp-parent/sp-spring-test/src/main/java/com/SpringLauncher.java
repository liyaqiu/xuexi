package com;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author lyq
 * @date 2021/12/4 12:34
 */
@SpringBootApplication
@MapperScans({@MapperScan("com.mybatisplus"),@MapperScan("com.transaction")})
public class SpringLauncher {

    public static void main(String[] args) {
        SpringApplication.run(SpringLauncher.class, args);
    }

}
