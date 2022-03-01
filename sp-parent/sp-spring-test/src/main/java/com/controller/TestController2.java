package com.controller;

import com.bean.Goods;
import com.bean.UserEntity;
import com.config.MyconfigProperties;
import com.config.MyconfigYAML;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author lyq
 * @date 2022/2/26 9:21
 */
@Controller
@Import(UserEntity.class)
@Slf4j
public class TestController2 {

    @GetMapping("/test2")
    public String test2(){
        log.debug("test2");
        return "/hello1.html"; //返回html或者jsp页面
    }

    @GetMapping("/test4")
    @ResponseBody
    public String test4(){
        log.debug("test4");
        return "@RestController = @Controller + @ResponseBody ";
    }



    @GetMapping("/test5")
    @ResponseBody
    public Goods test5(){
        log.debug("test5");
        return new Goods("ipone8","500");
    }


    @Autowired
    MyconfigYAML myconfigYAML;
    @Autowired
    MyconfigProperties myconfigProperties;

    @GetMapping("/test6")
    @ResponseBody
    public String test6(){
        log.debug("myconfigYAML,{}",myconfigYAML);
        log.debug("myconfigProperties,{}",myconfigProperties);
        return "test6";
    }

}
