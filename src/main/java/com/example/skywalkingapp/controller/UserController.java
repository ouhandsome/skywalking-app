package com.example.skywalkingapp.controller;

import com.example.skywalkingapp.entity.User;
import com.example.skywalkingapp.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String index() {
        return "UserController. " + LocalDate.now().toString();
    }


    /**
     * 查询所有用户列表
     *
     * @return
     */
    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

    /**
     * 查询所有用户列表
     *
     * @return
     */
    @GetMapping("/find")
    public List<User> findList(@RequestParam(value = "name", required = true) String name) {
        LOGGER.info("name=" + name);
        return userService.findByName(name);
    }

    /**
     * 查询所有用户列表
     *
     * @return
     */
    @GetMapping("/findUser")
    public List<User> findList(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "name", required = false) String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        LOGGER.info("id=" + id + " , name=" + name);
        return userService.findByUser(user);
    }

}
