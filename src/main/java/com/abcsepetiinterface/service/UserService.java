package com.abcsepetiinterface.service;

import com.abcsepetiinterface.model.User;

import java.util.List;

public interface UserService {
    User getUserById(String userid);

    List<User> getAllUsers();

    String deleteUserById(String userid);

    User saveUser(User user);
}
