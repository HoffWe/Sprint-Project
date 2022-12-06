package com.example.sprintproject.mapper;

import com.example.sprintproject.dto.UserAppDto;
import com.example.sprintproject.model.UserApp;

public class UserAppMapper {

    public static UserAppDto mapToDto(UserApp userApp){
       return UserAppDto.builder()
                .userName(userApp.getUserName())
                .eMail(userApp.getEMail())
                .password(userApp.getPassword())
                .role(userApp.getRole())
                .build();

    }
}
