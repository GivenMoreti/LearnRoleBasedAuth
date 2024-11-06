package com.example.JWTokenBasedAuthenticationAndAuthorization.Dao;

import com.example.JWTokenBasedAuthenticationAndAuthorization.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,String> {
}
