package com.example.langchain4j.controller;

import com.example.langchain4j.model.ChatResponse;
import com.example.langchain4j.service.AgentService;
import com.example.langchain4j.service.ChatService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class AgentController {

    private final AgentService agentService;
    private final ChatService chatService;

    @PostMapping("/event")
    public String model(@RequestBody EventRequest request) {
        return agentService.ask(request.getMessage());
    }

    @PostMapping("/api/chat")
    public ChatResponse chat(@RequestBody EventRequest request) {
        var reply = chatService.chat(request.getMessage());
        return new ChatResponse(reply);
    }
}

