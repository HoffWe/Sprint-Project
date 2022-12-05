package com.example.sprintproject.repository;

import com.example.sprintproject.model.ShoppingListElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingListElementRepository extends JpaRepository< ShoppingListElement, Long > {

}
