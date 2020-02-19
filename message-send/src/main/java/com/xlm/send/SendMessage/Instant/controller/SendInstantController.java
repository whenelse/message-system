package com.xlm.send.SendMessage.Instant.controller;

import com.xlm.send.SendMessage.Instant.service.SendInstantService;
import com.xlm.send.SendMessage.Instant.vo.MessageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendInstantController {

    @Autowired
    SendInstantService sendInstantService;

    public boolean sendInstant(MessageInfoVo messageInfoVo){
        return sendInstantService.sendInstant(messageInfoVo);
    }
}
