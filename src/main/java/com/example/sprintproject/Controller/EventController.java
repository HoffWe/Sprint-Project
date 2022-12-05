package com.example.sprintproject.Controller;


import com.example.sprintproject.dto.EventDto;
import com.example.sprintproject.mapper.EventMapper;
import com.example.sprintproject.model.Event;
import com.example.sprintproject.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@RestController
@RequestMapping("api/events")
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping("")
    public ResponseEntity<Event> add(@RequestBody EventDto eventDto){
        return ResponseEntity.ok(eventService.add(eventDto));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        eventService.delete(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventDto> findById(@PathVariable long id){
        Optional<Event> optionalEvent = eventService.findById(id);
        return optionalEvent.map(event -> ResponseEntity.ok(EventMapper.mapToDto(event))).orElseGet(()-> ResponseEntity.of(Optional.empty()));
    }

}
