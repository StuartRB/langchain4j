package com.example.langchain4j.tools.calendar;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class CalendarResponse {
    private List<Day> days;
}
