package cn.dy.service.impl;

import cn.dy.mapper.UserMapper;
import cn.dy.pojo.User;
import cn.dy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by yanhongbo
 * 日期 2021/7/1
 *
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
@Autowired
private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return null;
    }
}
