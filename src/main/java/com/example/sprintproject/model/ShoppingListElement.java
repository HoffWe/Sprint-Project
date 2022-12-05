package com.example.sprintproject.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Builder
@Data
public class ShoppingListElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(targetEntity = Item.class)
    private Item item;
    private long quantity;
    private boolean isBought;


}
