package com.example.sprintproject.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class UserAppDtoOut {


    private String userName;
    private String eMail;
    private long id;
}
