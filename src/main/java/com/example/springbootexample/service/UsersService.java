package com.example.springbootexample.service;

import com.example.springbootexample.dto.UsersDto;
import com.example.springbootexample.exception.ValidateException;

import java.util.List;

public interface UsersService {
    UsersDto saveUser(UsersDto usersDto) throws ValidateException;
    void deleteUser(Integer userId);
    UsersDto findByLogin(String login);
    List<UsersDto> findAll();
}
