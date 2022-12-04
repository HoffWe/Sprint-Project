package com.example.sprintproject.service;

import com.example.sprintproject.dto.EventDto;
import com.example.sprintproject.model.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {

    Event add (EventDto newEvent);
    Optional<Event> findById(long eventId);
    void delete(long eventId);
}
