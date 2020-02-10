package com.xlm.send.mapper;

import com.xlm.send.pojo.InstantMessage;
import org.springframework.stereotype.Component;

@Component
public interface InstantMessageMapper {
    int insert(InstantMessage record);

    int insertSelective(InstantMessage record);
}