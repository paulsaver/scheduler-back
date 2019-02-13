package com.masleena.scheduler.controller;

import com.masleena.scheduler.model.User;
import com.masleena.scheduler.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public @ResponseBody
    User register(@RequestBody User user){
        return userService.registerNewUserAccount(user);
    }
}