package com.chichi.controller;

import com.chichi.dao.UserDao;
import com.chichi.entity.User;
import com.chichi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    String index(){
        userService.print();
        return "index";
    }
}
