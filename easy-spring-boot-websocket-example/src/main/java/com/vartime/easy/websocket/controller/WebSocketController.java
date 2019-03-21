package com.vartime.easy.websocket.controller;

import com.vartime.easy.commons.utils.DateUtils;
import com.vartime.easy.websocket.message.SocketMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : yinlin
 * @version : 1.0
 * @date : 2019-03-20 20:42
 * @Description :
 * @Copyright : Copyright (c) 2018
 * @Company : EasySite Technology Chengdu Co. Ltd.
 * @link : com.vartime.easy.websocket.controller.WebSocketController
 */
@Controller
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping("/i")
    public String index() {
        return "index";
    }

    @MessageMapping("/send")
    @SendTo("/topic/send")
    public SocketMessage send(SocketMessage message) {
        message.setDate(DateUtils.now());
        return message;
    }

    @Scheduled(fixedRate = 1000)
    @SendTo("/topic/callback")
    public Object callback() {
        template.convertAndSend("/topic/callback", DateUtils.now());
        return "callback";
    }
}
