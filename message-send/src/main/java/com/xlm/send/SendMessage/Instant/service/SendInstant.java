package com.xlm.send.SendMessage.Instant.service;

import com.xlm.send.SendMessage.Instant.vo.MessageInfoVo;
import org.springframework.stereotype.Service;

@Service
public interface SendInstant {
    boolean sendInstant(MessageInfoVo messageInfoVo);
}
