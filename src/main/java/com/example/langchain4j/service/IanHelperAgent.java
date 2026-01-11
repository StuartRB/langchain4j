package com.example.langchain4j.service;

import dev.langchain4j.agentic.Agent;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.V;

public interface IanHelperAgent {
    @UserMessage("""
            You are a helpful AI agent who answers
            questions all about Ian. Try and answer the
            question: {{question}}.
            """)
    @Agent("Answers questions about Ian")
    String answerQuestion(@V("question") String question);
}