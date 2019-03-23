package com.masleena.scheduler.controller;

import com.masleena.scheduler.model.User;
import com.masleena.scheduler.repositories.UserRepository;
import com.masleena.scheduler.utils.RestRequestResponseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;



@Api(value = "registration", description = "API for User Registration and login.")
@RestController
@AllArgsConstructor
public class RegistrationController extends RestRequestResponseController {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

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