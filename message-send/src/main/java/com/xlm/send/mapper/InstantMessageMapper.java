package com.xlm.send.mapper;

import com.xlm.send.pojo.InstantMessage;

public interface InstantMessageMapper {
    int insert(InstantMessage record);

    int insertSelective(InstantMessage record);
}