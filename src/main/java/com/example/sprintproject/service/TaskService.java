package com.example.sprintproject.service;

import com.example.sprintproject.dto.TaskDto;
import com.example.sprintproject.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {

    Task add (TaskDto taskDto);
    Optional<Task> findById(long id);
    List<Task> findAll();
    List<Task> findByUserId(long id);
    Task update(Task updatedTask);
    void deleteById(long id);
}
