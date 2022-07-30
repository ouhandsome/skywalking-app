package com.example.skywalkingapp.mapper;

import com.example.skywalkingapp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询所有用户列表
     *
     * @return
     */
    List<User> selectAll();

    /**
     * 通过名称查询
     *
     * @param name
     * @return
     */
    List<User> findByName(@Param(value = "name") String name);

    List<User> findByUser(User user);
}
