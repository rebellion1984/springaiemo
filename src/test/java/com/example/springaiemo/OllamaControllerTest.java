package com.example.springaiemo;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OllamaControllerTest {

    @Autowired
    private ChatClient.Builder chatClientBuilder;

    @Test
    void testChatResponse() {
        var chatClient = chatClientBuilder.build();

        // Send a prompt to the chat model and get the response
        String prompt = "Hello, how are you?";
        String response = chatClient.prompt(prompt).call().chatResponse().getResult().getOutput().getText();

        // Print the response
        System.out.println("Chat Response: " + response);
    }

}
