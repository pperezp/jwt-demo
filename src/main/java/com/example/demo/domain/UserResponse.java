package com.example.demo.domain;

import com.example.demo.jwt.TokenInfo;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserResponse {
    private int id;
    private TokenInfo tokenInfo;
}
