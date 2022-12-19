package com.example.sprintproject.Controller;


import com.example.sprintproject.dto.TaskDto;
import com.example.sprintproject.mapper.TaskMapper;
import com.example.sprintproject.model.Task;
import com.example.sprintproject.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @GetMapping("")
    public List<TaskDto> findAll(){
        return  taskService.findAll().stream()
                .map(TaskMapper::mapToDto)
                .collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ResponseEntity<TaskDto> findById(@PathVariable long id){
        Optional<Task> optionalTask = taskService.findById(id);
        return optionalTask.map(task -> ResponseEntity.ok(TaskMapper.mapToDto(task)))
                .orElseGet(()->ResponseEntity.of(Optional.empty()));
    }

    @GetMapping("/{userId}")
    public List<TaskDto> findByUserId(@PathVariable long userId){
        return taskService.findByUserId(userId).stream()
                .map(TaskMapper::mapToDto).collect(Collectors.toList());
    }

    @PutMapping("")
    public ResponseEntity<Task> update(@RequestBody Task task) {
        if (taskService.findById(task.getId()).isPresent())
            return ResponseEntity.ok(taskService.update(task));
        else
            return ResponseEntity.status(HttpStatus.CREATED).body(taskService.update(task));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        taskService.deleteById(id);
    }
}
