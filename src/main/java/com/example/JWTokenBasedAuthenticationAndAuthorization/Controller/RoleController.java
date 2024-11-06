package com.example.JWTokenBasedAuthenticationAndAuthorization.Controller;

import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.Role;
import com.example.JWTokenBasedAuthenticationAndAuthorization.Services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    /*CONTAINS ALL OUR ENDPOINTS*/
    @Autowired
    private RoleService roleService;
    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role){
        return roleService.createNewRole(role);
    }
}
