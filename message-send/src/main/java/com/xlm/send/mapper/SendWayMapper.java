package com.xlm.send.mapper;

import com.xlm.send.pojo.SendWay;
import org.springframework.stereotype.Component;

@Component
public interface SendWayMapper {
    int insert(SendWay record);

    int insertSelective(SendWay record);
}