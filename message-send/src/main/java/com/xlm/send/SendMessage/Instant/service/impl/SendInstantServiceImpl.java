package com.xlm.send.SendMessage.Instant.service.impl;

import com.xlm.send.SendMessage.Instant.mapper.SendInstantMapper;
import com.xlm.send.SendMessage.Instant.service.SendInstantService;
import com.xlm.send.SendMessage.Instant.vo.MessageInfoVo;
import com.xlm.send.pojo.MessageContent;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;

public class SendInstantServiceImpl implements SendInstantService {

    @Autowired
    SendInstantMapper sendInstantMapper;

    @Override
    public boolean sendInstant(MessageInfoVo messageInfoVo) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        Date date = new Date();
        //Todo appid问题
        MessageContent messageContent = MessageContent.builder().appId("").modelId(messageInfoVo.getModelId())
                .uuid(uuid).messageId(messageInfoVo.getMessageId()).userId(messageInfoVo.getUserId())
                .title(messageInfoVo.getTitle()).content(messageInfoVo.getContent()).isRead("00")
                .createTime(date).createId(messageInfoVo.getCreateId()).build();

        try{
            sendInstantMapper.sendInstant(messageContent);
        }catch (Exception e){
            return false;
        }

        return true;
    }
}
