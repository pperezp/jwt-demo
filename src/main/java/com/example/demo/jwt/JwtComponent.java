package com.example.demo.jwt;

import com.example.demo.domain.UserResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class JwtComponent {

    public TokenInfo getToken(UserResponse userRequest) {
        String userId = String.valueOf(userRequest.getId());
        Date now = new Date(System.currentTimeMillis());
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER");
        Date expiration = JwtConfig.getExpiration();

        String bearerToken = Jwts.builder()
            .setId(userId)
            .setSubject(userId)
            .claim("authorities", grantedAuthorities.stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
            .setIssuedAt(now)
            .setExpiration(expiration)
            .signWith(SignatureAlgorithm.HS512, JwtConfig.SECRET_KEY)
            .compact();

        return new TokenInfo(bearerToken, expiration);
    }


}
