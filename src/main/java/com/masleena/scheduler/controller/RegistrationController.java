package com.masleena.scheduler.controller;

import com.masleena.scheduler.model.User;
import com.masleena.scheduler.repositories.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


import static com.masleena.scheduler.utils.RestRequestResponseHelper.*;

@Api(value = "registration", description = "API for User Registration and login.")
@RestController
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @ApiParam(name = "Register new user")
    @ApiResponse(code = 200,message ="null")
    @PostMapping("/register")
    public @ResponseBody
    ResponseEntity register(@RequestBody User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return getResponse(HttpStatus.OK);
    }

    @ApiOperation(value = "Login existing user", notes = "Description")
    @ApiResponse(code = 200,message ="null")
    @GetMapping("/login")
    public @ResponseBody
    ResponseEntity login() {
        return getResponse(HttpStatus.OK);
    }
}