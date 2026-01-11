package com.example.langchain4j.service;

import com.example.langchain4j.tools.IanTools;
import dev.langchain4j.agentic.AgenticServices;
import dev.langchain4j.model.chat.ChatModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AgentService {

    private final ChatModel chatModel;
    private final IanTools ianTools;

    public String ask(String message) {

        IanHelperAgent ianHelperAgent = AgenticServices.agentBuilder(IanHelperAgent.class)
                .chatModel(chatModel)
                .tools(ianTools)
                .build();

        return ianHelperAgent.answerQuestion(message);
    }
}
