package com.example.JWTokenBasedAuthenticationAndAuthorization.Dao;

import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,String> {
//    public Role createNewRole(Role role);
}
