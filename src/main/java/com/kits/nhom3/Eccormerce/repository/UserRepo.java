package com.kits.nhom3.Eccormerce.repository;

import com.kits.nhom3.Eccormerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
