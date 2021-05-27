package com.Spring.validation.controller;

import com.Spring.validation.model.User;
import com.Spring.validation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class UserController
{
    @Autowired
    private UserService userService;
    @PostMapping("/save")
public ResponseEntity<User> createUser(@Valid @RequestBody User user)
{
    User saveUser=userService.createUser(user);

    return new ResponseEntity<User>(saveUser, HttpStatus.CREATED);
}
}
