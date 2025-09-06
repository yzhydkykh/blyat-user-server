package com.example.demo.service;

import com.example.demo.datatypes.CreateUserInput;
import com.example.demo.datatypes.ReplaceUserInput;
import com.example.demo.datatypes.UpdateUserInput;
import com.example.demo.datatypes.User;
import com.example.demo.datatypes.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    private final HashMap<String, User> users = new HashMap<>();
    private final List<User> usersList = new ArrayList<>();

    public List<User> getUsers() {
        Long num1 = 1L;
        Long num2 = 1L;

        Boolean test = num1==num2;
        System.out.println(test);
        return usersList ;
    }
    public User getUser(String id) {
        if(users.get(id) == null) {
            throw new UserNotFoundException(id);
        }
        return users.get(id);
    }

    public User addUser(CreateUserInput user) {
        User createdUser = new User(user.getName(), user.getRole());
        users.put(createdUser.getId(), createdUser);
        usersList.add(createdUser);
        return createdUser;
    }
    public void removeUser(String id) {
        User user = users.get(id);
        if(user == null) {
            throw new UserNotFoundException(id);
        }
        users.remove(id);
        usersList.remove(user);
    }
    public User putUser(ReplaceUserInput user, String id) {
        User updatedUser = users.get(id);
        updatedUser.setName(user.getName());
        updatedUser.setRole(user.getRole());
        updatedUser.setUpdatedAt(new Date(System.currentTimeMillis()));
        return updatedUser;
    }
    public User patchUser(UpdateUserInput user, String id) {
        User updatedUser = users.get(id);
        if(user.getName().isPresent()){
            updatedUser.setName(user.getName().get());
        }
        if(user.getRole().isPresent()){
            updatedUser.setRole(user.getRole().get());
        }
        updatedUser.setUpdatedAt(new Date(System.currentTimeMillis()));
        return updatedUser;
    }

}
