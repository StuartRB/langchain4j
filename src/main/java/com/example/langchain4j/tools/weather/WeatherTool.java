package com.example.langchain4j.tools.weather;

import com.example.langchain4j.tools.weather.WeatherResponse;
import dev.langchain4j.agent.tool.P;
import dev.langchain4j.agent.tool.Tool;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@AllArgsConstructor
public class WeatherTool {

    private final RestClient restClient;

    @Tool("Returns the hourly weather for the next seven days in a town location")
    public WeatherResponse getWeather(@P("the town name") String town) {

        System.out.printf(">>> using weather tool for town %s", town);
        return restClient.get()
                .uri("https://api.open-meteo.com/v1/forecast?latitude=54.72&longitude=5.81&hourly=temperature_2m,wind_speed_10m,precipitation&wind_speed_unit=mph")
                .retrieve()
                .body(WeatherResponse.class);
    }
}




