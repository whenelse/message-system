package com.xlm.send.SendMessage.SendWay.service.impl;

import com.xlm.send.SendMessage.SendWay.service.SendWayService;
import com.xlm.send.mapper.SendWayMapper;
import com.xlm.send.pojo.SendWay;
import org.springframework.beans.factory.annotation.Autowired;

public class SendWayServiceImpl implements SendWayService {

    @Autowired
    SendWayMapper sendWayMapper;

    @Override
    public boolean SendWay(SendWay sendWay) {
        try {
            sendWayMapper.insert(sendWay);
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
