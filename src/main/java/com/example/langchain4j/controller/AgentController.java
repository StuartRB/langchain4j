package com.example.langchain4j.controller;

import com.example.langchain4j.service.AgentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class AgentController {

    private final AgentService agentService;

    @PostMapping("/event")
    public String model(@RequestBody EventRequest request) {
        return agentService.ask(request.getMessage());
    }
}

