package com.nitzbits.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Setter
@Getter
@Entity
public class Users {

    @Id
    private String username;
    private String password;
    private String email;
    private String role;

    public Users() {
    }

    public Users(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

}



