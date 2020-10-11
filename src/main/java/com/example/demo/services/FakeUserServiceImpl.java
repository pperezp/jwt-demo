package com.example.demo.services;

import com.example.demo.domain.UserRequest;
import com.example.demo.domain.UserResponse;
import com.example.demo.exceptions.UserNotFoundException;
import com.example.demo.jwt.JwtComponent;
import com.example.demo.jwt.TokenInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service("fakeUserService")
public class FakeUserServiceImpl implements UserService{
    @Autowired
    private JwtComponent jwtComponent;

    @Override
    public UserResponse login(UserRequest userRequest) throws UserNotFoundException {
        UserResponse userResponse = getUser(userRequest);

        TokenInfo tokenInfo = jwtComponent.getToken(userResponse);
        userResponse.setTokenInfo(tokenInfo);

        return userResponse;
    }

    private UserResponse getUser(UserRequest userRequest) throws UserNotFoundException{
        UserResponse userResponse = new UserResponse();

        boolean validUser = new Random().nextBoolean();

        if(!validUser){
            throw new UserNotFoundException();
        }

        userResponse.setId(100);

        return userResponse;
    }
}
