package com.example.sprintproject.service;

import com.example.sprintproject.dto.EventDto;
import com.example.sprintproject.model.Event;
import com.example.sprintproject.model.UserApp;
import com.example.sprintproject.repository.EventRepository;
import com.example.sprintproject.repository.UserAppRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JpaEventService implements EventService{

    private final EventRepository eventRepository;

    public JpaEventService(EventRepository eventRepository, UserAppRepository userAppRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event add(EventDto newEvent) {
        Event event = Event.builder()
                .name(newEvent.getName())
                .content(newEvent.getContent())
                .date(newEvent.getDate())
                .userApp(UserApp.builder()
                        .id(newEvent.getUserId())
                        .build())
                .build();
        return eventRepository.save(event);
    }

    @Override
    public Optional<Event> findById(long eventId) {
        return eventRepository.findById(eventId);
    }

    @Override
    public List<Event> findByUserAppId(long userId) {
        return eventRepository.findByUserApp_Id(userId);
    }


    @Override
    public void delete(long eventId) {
        eventRepository.deleteById(eventId);
    }

    @Override
    public List<Event> findAll() {
        return eventRepository.findAll();
    }
}
