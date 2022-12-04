package com.example.sprintproject.model;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(targetEntity = UserApp.class)
    private UserApp user;
    private String title;
    private String content;
    private LocalDateTime creationDate;
    private LocalDateTime deadline;
    private LocalDateTime finishDate;
    private boolean isFinished;


}
