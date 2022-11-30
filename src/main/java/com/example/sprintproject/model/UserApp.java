package com.example.sprintproject.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class UserApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String password;
    private String eMail;
    @OneToMany(targetEntity = Item.class)
    @ToString.Exclude
    private Set<Item> shoppingList= new HashSet<>();
    @OneToMany(targetEntity = Task.class)
    @ToString.Exclude
    private Set<Task> tasks = new HashSet<>();
    @OneToMany
    @ToString.Exclude
    private Set<Event> events = new HashSet<>();
    private String role;
    private boolean isActive;

}
