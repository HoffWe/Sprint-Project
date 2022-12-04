package com.example.sprintproject.repository;

import com.example.sprintproject.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
    List<Task> findByUser_Id(long userId);

}
