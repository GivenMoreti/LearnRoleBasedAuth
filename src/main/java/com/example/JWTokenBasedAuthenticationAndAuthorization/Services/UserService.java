package com.example.JWTokenBasedAuthenticationAndAuthorization.Services;

import com.example.JWTokenBasedAuthenticationAndAuthorization.Dao.RoleDao;
import com.example.JWTokenBasedAuthenticationAndAuthorization.Dao.UserDao;
import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.Role;
import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;
    public User createUser(User user){
        return userDao.save(user);
    }

//    this method seeds the database with default data upon resetting
    public void initUserRole(){
//        FIRST CREATE MULTIPLE ROLES
//        role number 1
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role desx");
        roleDao.save(adminRole);
//role number 2
        Role userRole= new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default user role");
        roleDao.save(userRole);


//CREATE USERS
//        admin instance
        User admin = new User();

        admin.setPassword("pass@admin");
        admin.setFirstName("TIM");
        admin.setLastName("KIMS");
        admin.setUsername("timmie");
//        a user can have multiple roles assigned to them
//        Admin can act as both admin and user
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminRoles.add(userRole);

        admin.setRoles(adminRoles);

        userDao.save(admin);

//        user number 1
        User user = new User();
        user.setFirstName("GIVEN");
        user.setLastName("MORETI");
        user.setPassword("1234");
        user.setUsername("Givie");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRoles(userRoles);
        userDao.save(user);
    }
}
