package com.example.sprintproject.repository;

import com.example.sprintproject.model.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShoppingListRepository extends JpaRepository<ShoppingList,Long> {

    List<ShoppingList> findByUser_Id(long userId);
}
