package com.example.langchain4j.tools.calendar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CalendarEvent {
    private String startTime;
    private String endTime;
    private String description;
}
