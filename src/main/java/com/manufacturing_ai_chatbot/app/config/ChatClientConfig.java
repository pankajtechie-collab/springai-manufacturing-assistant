package com.manufacturing_ai_chatbot.app.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Configuration
public class ChatClientConfig {

    private final ChatModel chatModel;

    public ChatClientConfig(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @Bean
    public ChatClient chatClient() throws IOException {
        String systemPrompt = Files.readString(
                Paths.get("src/main/resources/prompts/technician.st"),
                StandardCharsets.UTF_8
        );

        return ChatClient.builder(chatModel)
                .defaultSystem(systemPrompt)
                .build();
    }
}
