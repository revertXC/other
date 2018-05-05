package com.deer.webSocket.controller;

import com.deer.webSocket.config.WebSocketConfig;
import com.deer.webSocket.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.sockjs.transport.session.WebSocketServerSockJsSession;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@Controller
public class WebSocketController {
    @Autowired
    private WebSocketService webSocketService;


}
