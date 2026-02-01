package com.example.langchain4j.service;

import dev.langchain4j.agentic.Agent;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface EventAgent {
    @UserMessage("""
            You are a helpful AI agent who manages events.
            With the criteria from the user, try and organise
            an event with available tools.
            Event requirements: {{eventDetail}}
            """)
    @Agent("Help to organise an event")
    String orgnaniseEvent(@V("eventDetail") String eventDetail);
}