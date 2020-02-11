package com.xlm.send.mapper;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public interface MessageMapper {
    int selectNumByTime(String modelId,Date date);
}