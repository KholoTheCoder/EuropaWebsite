package com.europa.europa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.europa.europa.europaUser;
import com.europa.europa.europaRepository;

@Service
public class europaService {

    @Autowired
    private europaRepository europaRepository;

    public void saveUser(europaUser user) {
        europaRepository.save(user);
    }

    public europaUser findByEmail(String email) {
        return europaRepository.findByEmail(email);
    }
}
