package com.example.langchain4j.tools.weather;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Hourly {
    private List<String> time;
    private List<Double> temperature_2m;
    private List<Double> wind_speed_10m;
    private List<Double> precipitation;
}
