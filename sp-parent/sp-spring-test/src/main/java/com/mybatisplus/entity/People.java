package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author lyq
 * @date 2021/12/5 12:27
 */
@Getter
@Setter
@ToString
@TableName("user")
public class People {
    private String id;
    private String name;
    private Integer age;
    @TableField(exist = false)
    Son son;
}
