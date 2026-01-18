package com.example.langchain4j.tools.calendar;

import dev.langchain4j.agent.tool.Tool;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class CalendarTool {

    @Tool("Returns calendar data for the next seven days")
    public CalendarResponse getCalendar() {

        System.out.print(">>> using calendar tool");

        return CalendarResponse.builder()
                .days(List.of(Day.builder()
                                .date("19/01/2026")
                                .event(List.of(CalendarEvent.builder()
                                        .description("Working")
                                        .startTime("09:00")
                                        .endTime("21:00")
                                        .build()))
                                .build(),
                        Day.builder()
                                .date("20/01/2026")
                                .event(List.of(CalendarEvent.builder()
                                        .description("doctors")
                                        .startTime("08:30")
                                        .endTime("09:00")
                                        .build()))
                                .build()))
                .build();

    }
}




