package com.example.sprintproject.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne (targetEntity = UserApp.class)
    private UserApp userApp;
    private LocalDate date;
    private String content;

}
