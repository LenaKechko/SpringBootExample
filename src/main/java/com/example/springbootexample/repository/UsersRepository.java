package com.example.springbootexample.repository;

import com.example.springbootexample.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByLogin(String login);
}
