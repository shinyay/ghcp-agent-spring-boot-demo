package com.microsoft.shinyay.demo.repository;

import com.microsoft.shinyay.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
