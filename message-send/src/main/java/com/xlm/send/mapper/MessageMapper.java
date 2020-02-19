package com.xlm.send.mapper;

import com.xlm.send.SelectNotRead.vo.ModelMessage;
import com.xlm.send.pojo.Message;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public interface MessageMapper {

    int selectNumByTime(String modelId,Date date);

    List<Message> selectMessageByUserAndModel(ModelMessage message);
}