package com.xlm.send.SendMessage.Instant.controller;

import com.xlm.send.SendMessage.Instant.service.SendInstant;
import com.xlm.send.SendMessage.Instant.vo.MessageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendInstantController {

    @Autowired
    SendInstant sendInstant;

    public boolean sendInstant(MessageInfoVo messageInfoVo){
        return sendInstant.sendInstant(messageInfoVo);
    }
}
