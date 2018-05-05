package com.deer.webSocket.service;

import com.deer.webSocket.config.WebSocketConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebSocketService {

    @Autowired
    private SimpMessagingTemplate template;

    /**
     * 发送给指定用户
     * @param users
     * @param msg
     */
    public void send2Users(List<String> users, String msg) {

        for(String s: users){
            template.convertAndSendToUser(s, "/msg", msg);
        }
    }

}
