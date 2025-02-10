package com.vaishnavi.cab.booking.service;

import com.vaishnavi.cab.booking.model.User;
import com.vaishnavi.cab.booking.repository.UserRepository;

public class UserService extends BaseService{
    @Override
    public void add() {
        System.out.println("User added.");
    }

    @Override
    public void update() {
        System.out.println("User updated.");
    }

    @Override
    public void delete() {
        System.out.println("User deleted.");
    }

    @Override
    public void view() {
        System.out.println("User details viewed.");
    }

    public void registerUser(User user) {
    }
}

