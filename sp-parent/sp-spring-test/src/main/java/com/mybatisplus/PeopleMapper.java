package com.mybatisplus;

import com.mybatisplus.entity.People;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author lyq
 * @date 2021/12/5 12:32
 */
@Mapper
public interface PeopleMapper extends BaseMapper<People> {
    public abstract People queryUserById(String id);
    @Select("select * from user where id = #{id}")
    public abstract People queryPeopleById(@Param("id") String id);

    public abstract List<People> selectPeoples();
}
