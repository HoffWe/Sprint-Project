package com.example.sprintproject.service;

import com.example.sprintproject.dto.EventDto;
import com.example.sprintproject.model.Event;
import com.example.sprintproject.repository.EventRepository;

import java.util.Optional;

public class JpaEventService implements EventService{

    private final EventRepository eventRepository;

    public JpaEventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event add(EventDto newEvent) {
        return null;
    }

    @Override
    public Optional<Event> findById(long eventId) {
        return eventRepository.findById(eventId);
    }

    @Override
    public Optional<Event> findByUserAppId(long userAppId) {
        return eventRepository.;
    }

    @Override
    public void delete(long eventId) {
        eventRepository.deleteById(eventId);
    }
}
