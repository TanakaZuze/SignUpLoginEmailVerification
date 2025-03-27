package com.suliev.SignUpLoginEmailVerification.repository;

import com.suliev.SignUpLoginEmailVerification.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
