package com.example.sprintproject.repository;

import com.example.sprintproject.model.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListRepository extends JpaRepository<ShoppingList,Long> {
}
