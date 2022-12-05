package com.example.sprintproject.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
public class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToOne (targetEntity = UserApp.class)
    private UserApp user;
    @OneToMany(targetEntity = ShoppingListElement.class)
    @ToString.Exclude
    private Set<ShoppingListElement> shoppingListElements = new HashSet<>();
}
