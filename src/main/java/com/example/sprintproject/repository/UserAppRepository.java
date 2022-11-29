package com.example.sprintproject.repository;

import com.example.sprintproject.model.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserAppRepository extends JpaRepository<UserApp, Long> {

}
