package com.example.sprintproject.service;


import com.example.sprintproject.dto.TaskDto;
import com.example.sprintproject.model.Task;
import com.example.sprintproject.model.UserApp;
import com.example.sprintproject.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JpaTaskService implements TaskService{

    private final TaskRepository taskRepository;

    public JpaTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task add(TaskDto taskDto) {
        Task task = Task.builder()
                .title(taskDto.getTitle())
                .content(taskDto.getContent())
                .user(UserApp.builder()
                        .id(taskDto.getUserid())
                        .build())
                .creationDate(taskDto.getCreationDate())
                .deadline(taskDto.getDeadline())
                .isFinished(false)
                .build();
        return taskRepository.save(task);
    }

    @Override
    public Optional<Task> findById(long id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public List<Task> findByUserId(long id) {
        return taskRepository.findByUser_Id(id);
    }

    @Override
    public Task update(Task updatedTask) {
        return taskRepository.save(updatedTask);
    }

    @Override
    public void deleteById(long id) {
        taskRepository.deleteById(id);
    }
}
