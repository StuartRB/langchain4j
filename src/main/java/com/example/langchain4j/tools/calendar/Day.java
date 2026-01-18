package com.example.langchain4j.tools.calendar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Day {
    private String date;
    private List<CalendarEvent> event;
}
