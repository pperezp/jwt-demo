package com.example.demo.jwt;

import java.util.Calendar;
import java.util.Date;

public class JwtConfig {
    private final static int EXPIRATION_SECONDS = 20;
    private final static String STRING_SECRET_KEY = "secretKey";
    public final static byte[] SECRET_KEY = STRING_SECRET_KEY.getBytes();

    public static Date getExpiration() {
        Calendar now = Calendar.getInstance();
        now.add(Calendar.SECOND, EXPIRATION_SECONDS);

        return now.getTime();
    }
}
