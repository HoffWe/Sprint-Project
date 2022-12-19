package com.example.sprintproject.service;

import com.example.sprintproject.dto.UserAppDto;
import com.example.sprintproject.model.UserApp;
import com.example.sprintproject.repository.UserAppRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class JpaUserAppService implements UserAppService {

    private final UserAppRepository userAppRepository;

    public JpaUserAppService(UserAppRepository userAppRepository) {
        this.userAppRepository = userAppRepository;
    }

    @Override
    public UserApp add(UserAppDto newUser) {
        UserApp user = UserApp.builder()
                .userName(newUser.getUserName())
                .password(newUser.getPassword())
                .eMail(newUser.getEMail())
                .role("ROLE USER")
                .build();
        return userAppRepository.save(user);
    }

    @Override
    public List<UserApp> findAll() {
        return userAppRepository.findAll();
    }

    @Override
    public Optional<UserApp> findById(long id) {
        return userAppRepository.findById(id);
    }

    @Override
    public UserApp update(UserApp userApp) {
        return userAppRepository.save(userApp);
    }

    @Override
    public void deleteById(long id) {
        userAppRepository.deleteById(id);
    }
}
