package com.config;

import com.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ContextLoaderListener;

/**
 * @author lyq
 * @date 2022/2/22 4:02
 * ReturnCallback 消息到了交换机，消息是否能路由到队列
 */
@Configuration
@Slf4j
@ComponentScan("cn.bean")
public class MyApplictionContext implements ApplicationContextAware {


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        log.info("spring bean 初始化完成。。。。");
    }

    @Bean(initMethod = "init",destroyMethod = "destory")
    public User test0() {
        return new User("liyaqiu");
    }

}
