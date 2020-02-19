package com.xlm.send.SendMessage.SendWay.controller;

import com.xlm.send.SendMessage.SendWay.service.SendWayService;
import com.xlm.send.pojo.SendWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendWayController {

    @Autowired
    SendWayService sendWayService;

    @RequestMapping
    public boolean sendWay(SendWay sendWay){
        return sendWayService.SendWay(sendWay);
    }
}
