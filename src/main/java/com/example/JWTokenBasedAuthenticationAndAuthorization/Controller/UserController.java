package com.example.JWTokenBasedAuthenticationAndAuthorization.Controller;

import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.User;
import com.example.JWTokenBasedAuthenticationAndAuthorization.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @PostMapping({"/createUser"})
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
