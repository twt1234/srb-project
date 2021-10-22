package com.atguigu.mybatisplus.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 包名：com.atguigu.mybatisplus.pojo
 *
 * @author MIX
 * 日期： 2021/10/22 19:30
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
