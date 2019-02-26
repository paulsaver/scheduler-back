package com.masleena.scheduler.controller;

import com.masleena.scheduler.model.User;
import com.masleena.scheduler.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/register")
    public @ResponseBody
    String register(@RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "OK";
    }

    @GetMapping("/login")
    public @ResponseBody
    String login() {
        return "OK";
    }
}