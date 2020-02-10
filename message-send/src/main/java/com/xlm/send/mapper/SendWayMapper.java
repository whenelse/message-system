package com.xlm.send.mapper;

import com.xlm.send.pojo.SendWay;

public interface SendWayMapper {
    int insert(SendWay record);

    int insertSelective(SendWay record);
}