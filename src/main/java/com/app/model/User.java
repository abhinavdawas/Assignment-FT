package com.app.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "name", "email"})
public class User {
    String id;
    String name;
    String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setUserId(String userId) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setUsername(String username) {
        this.name = name;
    }

    public String getEMail() {
        return email;
    }

    public void setUserEmail(String userEmail) {
        this.email = email;
    }
}
