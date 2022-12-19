package com.example.sprintproject.mapper;


import com.example.sprintproject.dto.EventDtoOut;
import com.example.sprintproject.model.Event;
public class EventMapper {


    public static EventDtoOut mapToDto(Event event){
       return EventDtoOut.builder()
               .id(event.getId())
               .name(event.getName())
               .content(event.getContent())
               .date(event.getDate())
               .userName(event.getUserApp().getUserName())
               .build();
   }
}
