package com.ggapp.controller;

import com.ggapp.service.SetupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class WebSocketController {

    @Autowired
    private SetupService setupService;

    @MessageMapping("/landing")
    @SendTo("/running")
    public boolean send(Long id) throws Exception {
        return setupService.startChamber(id);
    }

}
