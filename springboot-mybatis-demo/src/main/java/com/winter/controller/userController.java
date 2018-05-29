package com.winter.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.winter.service.user.UserService;
import com.winter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
@RequestMapping("/user")

public class UserController {
   //@Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/dsp")
    String test(){
        return "test";
    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class, args);
        //运行之后在浏览器中访问：http://localhost:8080/hello
    }
}
