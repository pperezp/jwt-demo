package com.example.demo.jwt;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
public class TokenInfo {
    private String token;
    private long expiration;

    public TokenInfo(String token, Date expiration) {
        this.token = token;
        this.expiration = expiration.getTime();
    }
}
