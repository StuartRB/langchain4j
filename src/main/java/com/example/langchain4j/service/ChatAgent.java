package com.example.langchain4j.service;

import dev.langchain4j.agentic.Agent;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface ChatAgent {
    @UserMessage("""
            You are a helpful AI agent who helps people.
            Try and answer this question: {{message}}
            """)
    @Agent("Help to organise an event")
    String chat(@V("message") String message);
}