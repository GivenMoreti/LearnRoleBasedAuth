package com.example.JWTokenBasedAuthenticationAndAuthorization.Services;

import com.example.JWTokenBasedAuthenticationAndAuthorization.Dao.UserDao;
import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public User createUser(User user){
        return userDao.save(user);
    }
}
