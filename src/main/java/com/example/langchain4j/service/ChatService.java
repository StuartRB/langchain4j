package com.example.langchain4j.service;

import dev.langchain4j.agentic.AgenticServices;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChatService {

    private final ChatModel chatModel;
    private final ChatMemory chatMemory;

    public String chat(String message) {

        ChatAgent chatAgent = AgenticServices.agentBuilder(ChatAgent.class)
                .chatModel(chatModel)
                .chatMemory(chatMemory)
                .build();

        return chatAgent.chat(message);
    }
}


//  given the weather this week and my schedule, suggest a time and type of event I could organise. The event should take about two hours and should be before it gets dark. I live in Belfast. Tell me what tools you used to help figure it out

//  ok, I'll do a walk and picnic. I have five pounds, what could I buy for that for my lunch

// give me a few interesting facts about my town