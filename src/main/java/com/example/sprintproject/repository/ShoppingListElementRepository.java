package com.example.sprintproject.repository;

import com.example.sprintproject.model.ShoppingListElement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListElementRepository extends JpaRepository< ShoppingListElement, Long > {
}
