package com.example.sprintproject.repository;


import com.example.sprintproject.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findByUserApp_Id(long userId);


}
