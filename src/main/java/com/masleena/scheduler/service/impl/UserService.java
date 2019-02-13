package com.masleena.scheduler.service.impl;

import com.masleena.scheduler.model.User;
import com.masleena.scheduler.repositories.UserRepository;
import com.masleena.scheduler.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User registerNewUserAccount(User user) {
        user.setRoles(Collections.singletonList("USER"));
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
}
