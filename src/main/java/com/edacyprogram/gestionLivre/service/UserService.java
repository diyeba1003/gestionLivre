package com.edacyprogram.gestionLivre.service;

import com.edacyprogram.gestionLivre.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }



}
