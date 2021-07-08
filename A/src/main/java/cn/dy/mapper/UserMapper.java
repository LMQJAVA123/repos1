package cn.dy.mapper;

import cn.dy.pojo.User;


import java.util.List;

/**
 * Create by yanhongbo
 * 日期 2021/7/1
 *
 * @Version 1.0
 */
public interface UserMapper {
    //查询所有用户信息
    List<User> findAll();
}
