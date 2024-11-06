package com.example.JWTokenBasedAuthenticationAndAuthorization.Controller;

import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.User;
import com.example.JWTokenBasedAuthenticationAndAuthorization.Services.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initUsersRoles(){
        //seeds the database on reset
        userService.initUserRole();
    }

    @PostMapping({"/createUser"})
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
}
