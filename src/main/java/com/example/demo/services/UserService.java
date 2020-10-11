package com.example.demo.services;

import com.example.demo.domain.UserRequest;
import com.example.demo.domain.UserResponse;
import com.example.demo.exceptions.UserNotFoundException;

public interface UserService {
    UserResponse login(UserRequest userRequest) throws UserNotFoundException;
}
