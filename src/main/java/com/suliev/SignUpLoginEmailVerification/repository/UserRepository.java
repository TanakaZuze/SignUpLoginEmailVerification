package com.suliev.SignUpLoginEmailVerification.repository;

import com.suliev.SignUpLoginEmailVerification.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByVerificationCode(String verificationCode);
}
