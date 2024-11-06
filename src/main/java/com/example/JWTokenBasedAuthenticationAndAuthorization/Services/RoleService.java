package com.example.JWTokenBasedAuthenticationAndAuthorization.Services;

import com.example.JWTokenBasedAuthenticationAndAuthorization.Dao.RoleDao;
import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    //Autowire | DI to use all the methods inside the dao

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){
       return roleDao.save(role);
    }



}
