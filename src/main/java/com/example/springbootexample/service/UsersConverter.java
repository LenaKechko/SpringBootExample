package com.example.springbootexample.service;

import com.example.springbootexample.dto.UsersDto;
import com.example.springbootexample.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUserDtoToUser(UsersDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setName(usersDto.getName());
        users.setLogin(usersDto.getLogin());
        users.setEmail(usersDto.getEmail());
        return users;
    }

    public UsersDto fromUserToUserDto(Users users) {
        return UsersDto.builder()
                .id(users.getId())
                .name(users.getName())
                .email(users.getEmail())
                .login(users.getEmail())
                .build();
    }
}
