package com.codemart.karmawebshop.repository;

import com.codemart.karmawebshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
