package com.Spring.validation.service;

import com.Spring.validation.model.User;
import com.Spring.validation.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
@Autowired
    private UserRepository userRepository;

public User createUser(User user)
{

    return userRepository.save(user);
}
}
