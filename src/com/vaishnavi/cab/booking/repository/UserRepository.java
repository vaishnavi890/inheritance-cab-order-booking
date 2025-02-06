package com.vaishnavi.cab.booking.repository;

import com.vaishnavi.cab.booking.model.User;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<Integer, User> users = new HashMap<>();

    public void saveUser(User user) {
        users.put(user.getId(), user);
        System.out.println("User saved successfully.");
    }

    public User getUserById(int userId) {
        return users.get(userId);
    }
}

