package com.example.JWTokenBasedAuthenticationAndAuthorization.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    private String username;
    private String firstName;
    private String lastName;
    private String password;

    /*A user can have many role
    * Many roles can have many users
    */
    @ManyToMany(fetch = FetchType.EAGER,cascade =CascadeType.ALL)
        @JoinTable(
            name="User_Role",
                joinColumns = {
                    @JoinColumn(name = "user_id")
                },
                inverseJoinColumns = {
                    @JoinColumn(name="role_id")

                })
    Set<Role> roles;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
