package com.manufacturing_ai_chatbot.app.services;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManufacturingChatbotService {
    @Autowired
    ChatClient chatClient;

    public String askProblem(String prompt) {
        return chatClient.prompt(prompt).call().content();
    }
}
