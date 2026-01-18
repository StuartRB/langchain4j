package com.example.langchain4j.tools.weather;

import com.example.langchain4j.tools.weather.Hourly;
import com.example.langchain4j.tools.weather.Units;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherResponse {
    private String latitude;
    private String longitude;
    private String generationtime_ms;
    private String utc_offset_seconds;
    private String timezone;
    private String timezone_abbreviation;
    private String elevation;
    private Hourly hourly;

    @JsonProperty("hourly_units")
    private Units hourlyUnits;
}
