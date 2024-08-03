package com.log_management.liquibase.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.log_management.liquibase.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
   
}
