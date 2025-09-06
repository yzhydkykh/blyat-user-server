package com.example.demo.datatypes;

import java.util.Date;
import java.util.UUID;

public class User {
    private String id;
    private String name;
    private Role role;
    private Date createdAt;
    private Date updatedAt;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public User(String name, Role role) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.role = role;
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }
}
