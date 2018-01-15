package com.xiaopotian.demo.controller;

import com.xiaopotian.demo.domain.User;
import com.xiaopotian.demo.service.test.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zoulu on 2017-12-25.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUser")
    @Cacheable(value = "user")
    public User getUser(){
        User user = userRepository.findByUserName("aa1");
        System.out.println("执行数据库！");

        return user;
    }
}
