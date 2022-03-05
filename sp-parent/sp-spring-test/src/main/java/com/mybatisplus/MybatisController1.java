package com.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.plugins.pagination.PageDto;
import com.baomidou.mybatisplus.extension.plugins.pagination.dialects.IDialect;
import com.baomidou.mybatisplus.extension.plugins.pagination.dialects.MySqlDialect;
import com.mybatisplus.entity.People;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/mybatis1")
//@Slf4j
public class MybatisController1 {

    private static final Logger log = LoggerFactory.getLogger("com.mybatisplus");

    @Autowired
    PeopleMapper peopleMapper;


    @GetMapping("/test")
    public void test() {
        log.debug("peopleMapper class :{}",peopleMapper.getClass());
        People people = peopleMapper.selectById("22225bf1-700d-4f53-9d7c-b238b882fad1");
        log.info("people {}",people);
    }
    @GetMapping("/test2")
    public void test2() {
        People people = peopleMapper.queryUserById("22225bf1-700d-4f53-9d7c-b238b882fad1");
        log.info("people {}",people);
    }

    @GetMapping("/test3")
    public void test3() {
        People people = peopleMapper.queryPeopleById("22225bf1-700d-4f53-9d7c-b238b882fad1");
        log.info("people {}",people);
    }

    /**
     * 添加分页插件拦截器
     * */
    @Bean
    public MybatisPlusInterceptor mPPageInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        log.info("mybatis plus 分页拦截器加载。。。");
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
        paginationInnerInterceptor.setDialect(new MySqlDialect());
        //paginationInnerInterceptor.setMaxLimit();
        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }

    @GetMapping("/test4")
    public void test4() {
        log.debug("分页查询");
        IPage<People> page = new PageDto<>(2, 2);
        peopleMapper.selectPage(page, null);
        for (People people : page.getRecords()) {
            log.info("当前页{}", people);
        }
        log.info("当前页{}", page.getCurrent());
    }

    //关联查询多字段映射
    @GetMapping("/test5")
    public void test5() {
        log.debug("关联查询多字段映射");
        List<People> peopleList = peopleMapper.selectPeoples();
        for (People people : peopleList) {
            log.info("当前页{}", people);
        }
    }



}
