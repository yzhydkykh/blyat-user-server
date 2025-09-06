package com.example.demo.controller;

import com.example.demo.Blyat;
import com.example.demo.datatypes.CreateUserInput;
import com.example.demo.datatypes.ReplaceUserInput;
import com.example.demo.datatypes.UpdateUserInput;
import com.example.demo.datatypes.User;
import com.example.demo.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{userId}")
    public User getUser(@PathVariable(value = "userId")String id) {
        return userService.getUser(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public User postUser(@Valid @RequestBody CreateUserInput user) {
        return userService.addUser(user);
    }
    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{userId}")
    public User putUser(@PathVariable(value = "userId") String userId, @Valid @RequestBody ReplaceUserInput user) {
        return userService.putUser(user, userId);
    }

    @ResponseStatus(HttpStatus.OK)
    @PatchMapping("/{userId}")
    public User patchUser(@PathVariable(value = "userId") String userId, @Valid @RequestBody UpdateUserInput user) {
        return userService.patchUser(user, userId);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable(value = "userId") String userId) {
       userService.removeUser(userId);
    }
}