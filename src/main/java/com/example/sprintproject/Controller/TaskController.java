package com.example.sprintproject.Controller;


import com.example.sprintproject.dto.TaskDto;
import com.example.sprintproject.model.Task;
import com.example.sprintproject.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("")
    public ResponseEntity<Task> add (@RequestBody TaskDto taskDto){
        return ResponseEntity.ok(taskService.add(taskDto));
    }

}
