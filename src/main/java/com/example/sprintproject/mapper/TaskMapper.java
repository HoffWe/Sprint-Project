package com.example.sprintproject.mapper;

import com.example.sprintproject.dto.TaskDto;
import com.example.sprintproject.model.Task;

public class TaskMapper {

    public static TaskDto mapToDto(Task task){
        return TaskDto.builder()
                .title(task.getTitle())
                .content(task.getContent())
                .creationDate(task.getCreationDate())
                .deadline(task.getDeadline())
                .isFinished(task.isFinished())
                .userid(task.getId())
                .finishDate(task.getFinishDate())
                .build();
    }
}
