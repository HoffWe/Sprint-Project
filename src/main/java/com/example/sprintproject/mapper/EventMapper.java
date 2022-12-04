package com.example.sprintproject.mapper;

import com.example.sprintproject.dto.EventDto;
import com.example.sprintproject.model.Event;

public class EventMapper {

   public static EventDto mapToDto(Event event){
       return EventDto.builder()
               .name(event.getName())
               .content(event.getContent())
               .date(event.getDate())
               .userId(event.getUserApp().getId())
               .build();
   }
}
