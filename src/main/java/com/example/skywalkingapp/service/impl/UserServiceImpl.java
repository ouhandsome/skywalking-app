package com.example.skywalkingapp.service.impl;

import com.example.skywalkingapp.entity.User;
import com.example.skywalkingapp.mapper.UserMapper;
import com.example.skywalkingapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    /**
     * 查询所有用户列表
     *
     * @return
     */
    @Override
    public List<User> list() {
        return userMapper.selectAll();
    }

    /**
     * 通过名称查询
     *
     * @param name
     * @return
     */
    @Override
    public List<User> findByName(String name) {
        return userMapper.findByName(name);
    }

    @Override
    public List<User> findByUser(User user) {
        return userMapper.findByUser(user);
    }
}
