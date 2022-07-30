package com.example.skywalkingapp.service;

import com.example.skywalkingapp.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author handsome
 */
//@Service
public interface UserService {
    /**
     * 查询所有用户列表
     *
     * @return
     */
    List<User> list();

    /**
     * 通过名称查询
     *
     * @param name
     * @return
     */
    List<User> findByName(@Param(value = "name") String name);

    List<User> findByUser(User user);
}
