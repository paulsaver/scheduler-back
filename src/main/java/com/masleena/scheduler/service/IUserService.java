package com.masleena.scheduler.service;

import com.masleena.scheduler.model.User;

public interface IUserService {
    User registerNewUserAccount(User accountDto);
}
