package com.example.langchain4j.service;

import com.example.langchain4j.tools.calendar.CalendarTool;
import com.example.langchain4j.tools.shop.ShopTool;
import com.example.langchain4j.tools.weather.WeatherTool;
import dev.langchain4j.agentic.AgenticServices;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AgentService {

    private final ChatModel chatModel;
    private final WeatherTool weatherTool;
    private final CalendarTool calendarTool;
    private final ShopTool shopTool;
    private final ChatMemory chatMemory;

    public String ask(String message) {

        EventAgent eventAgent = AgenticServices.agentBuilder(EventAgent.class)
                .chatModel(chatModel)
                .chatMemory(chatMemory)
                .tools(weatherTool, calendarTool, shopTool)
                .build();

        return eventAgent.orgnaniseEvent(message);
    }
}


//  given the weather this week and my schedule, suggest a time and type of event I could organise. The event should take about two hours and should be before it gets dark. I live in Belfast. Tell me what tools you used to help figure it out

//  ok, I'll do a walk and picnic. I have five pounds, what could I buy for that for my lunch

// give me a few interesting facts about my town