package com.example.sprintproject.mapper;

import com.example.sprintproject.dto.UserAppDtoOut;
import com.example.sprintproject.model.UserApp;

public class UserAppMapper {

    public static UserAppDtoOut mapToDto(UserApp userApp){
       return UserAppDtoOut.builder()
                .id(userApp.getId())
                .userName(userApp.getUserName())
                .eMail(userApp.getEMail())
                .build();

    }
}
