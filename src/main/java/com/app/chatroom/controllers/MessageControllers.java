package com.app.chatroom.controllers;

import com.app.chatroom.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageControllers {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent (@RequestBody Message message)
    {
        try{
            //processing can be added here for messages
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return message;
    }

}
