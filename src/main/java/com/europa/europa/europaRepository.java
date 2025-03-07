package com.europa.europa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.europa.europa.europaRepository;

public interface europaRepository extends JpaRepository<europaUser, Long> {
    europaUser findByEmail(String email);
}

