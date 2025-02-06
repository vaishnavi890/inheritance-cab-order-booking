package com.vaishnavi.cab.booking.controller;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.service.UserService;


public class UserController {
    private UserService userService = new UserService();

    public void registerUser(int id, String name, String email, String phone) {
        User user = new User(id, name, email, phone);
        userService.registerUser(user);
    }
}

