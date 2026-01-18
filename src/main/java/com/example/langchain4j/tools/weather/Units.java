package com.example.langchain4j.tools.weather;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Units {
    private String time;
    private String temperature_2m;
    private String wind_speed_10m;
    private String precipitation;
}
