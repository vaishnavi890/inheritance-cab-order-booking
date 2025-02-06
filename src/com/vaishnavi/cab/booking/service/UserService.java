package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository = new UserRepository();

    public void registerUser(User user) {
        if (userRepository.getUserById(user.getId()) == null) {
            userRepository.saveUser(user);
            System.out.println("User " + user.getName() + " registered successfully.");
        } else {
            System.out.println("User with ID " + user.getId() + " already exists.");
        }
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }
}

