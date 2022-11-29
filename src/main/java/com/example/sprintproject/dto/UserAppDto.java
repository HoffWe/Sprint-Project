package com.example.sprintproject.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Builder
public class UserAppDto {

    @NotNull
    @Length(min = 3, max = 50)
    private String userName;
    @NotNull
    @Length(min = 8, max = 50)
    private String password;
    @NotNull
    @Email
    private String eMail;
}
