package com.example.sprintproject.service;

import com.example.sprintproject.dto.UserAppDto;
import com.example.sprintproject.model.UserApp;

import java.util.List;
import java.util.Optional;

public interface UserAppService {

    UserApp add (UserAppDto newUser);
    List<UserApp> findAll();
    Optional<UserApp> findById(long id);
    UserApp update (UserApp userApp);
    void deleteById(long id);
}
