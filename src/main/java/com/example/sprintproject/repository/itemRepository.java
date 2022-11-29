package com.example.sprintproject.repository;

import com.example.sprintproject.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface itemRepository extends JpaRepository<Item,Long> {

}
