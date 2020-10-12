package com.example.demo.jwt;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.TextCodec;
import io.jsonwebtoken.impl.crypto.MacProvider;

import javax.crypto.SecretKey;
import java.util.Calendar;
import java.util.Date;

public class JwtConfig {
    private final static int EXPIRATION_SECONDS = 60;
    private final static String STRING_SECRET_KEY = "secretKey";
    public final static byte[] SECRET_KEY = STRING_SECRET_KEY.getBytes();

    public static Date getExpiration() {
        Calendar now = Calendar.getInstance();
        now.add(Calendar.SECOND, EXPIRATION_SECONDS);

        return now.getTime();
    }

    public static String getSecretKey(){
        SecretKey key = MacProvider.generateKey(SignatureAlgorithm.HS256);
        return TextCodec.BASE64.encode(key.getEncoded());
    }
}
