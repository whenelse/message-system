package com.xlm.send.SendMessage.Instant.mapper;

import com.xlm.send.pojo.MessageContent;
import org.springframework.stereotype.Component;

@Component
public interface SendInstantMapper {

    void sendInstant(MessageContent messageContent);

}