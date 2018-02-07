package com.things.controller;

import com.things.mapper.UserMapper;
import com.things.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Home Controller
 *
 * @author liangyali
 */
@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping
    public User index(@RequestParam(required = false) Long id) {
        return userMapper.findById(id);
    }

    @GetMapping("/insert")
    public String insert() {
        List<User> users = new ArrayList<>();
        users.add(new User("user_001"));
        users.add(new User("user_002"));
        users.add(new User("user_003"));

        userMapper.insertBatch(users);

        return "OK";
    }

    @GetMapping("/update")
    public String update() {
        List<User> users = new ArrayList<>();
        users.add(new User(9L,"user_001",1));
        users.add(new User(10L,"user_002",0));
        users.add(new User(11L,"user_003",2));

        userMapper.updateBatch(users);

        return "OK";
    }
}
