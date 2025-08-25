package com.manufacturing_ai_chatbot.app.controllers;

import com.manufacturing_ai_chatbot.app.services.ManufacturingChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/manufacturing-chatbot")
public class ManufacturingChatbotController {
    @Autowired
    ManufacturingChatbotService manufacturingChatbotService;

    @GetMapping("/ask-problem")
    public String chat(@RequestParam String prompt) {
        return manufacturingChatbotService.askProblem(prompt);
    }
}
