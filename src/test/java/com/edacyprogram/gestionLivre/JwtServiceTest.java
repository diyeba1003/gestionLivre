package com.edacyprogram.gestionLivre;

import com.edacyprogram.gestionLivre.security.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class JwtServiceTest {
    @Test
    public void testGenerateJwt() {
        JwtService jwtService = new JwtService();
        UserDetails userDetails = new User("testUser","password", Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
        String token = jwtService.generateToken(userDetails);
        System.out.println(token);
        assertNotNull(token);
    }
}
