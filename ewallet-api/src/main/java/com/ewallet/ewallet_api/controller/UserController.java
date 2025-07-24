package com.ewallet.ewallet_api.controller;

import com.ewallet.ewallet_api.model.User;
import com.ewallet.ewallet_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        user.setBalance(0.0); // Default balance
        return userRepository.save(user);
    }
}
