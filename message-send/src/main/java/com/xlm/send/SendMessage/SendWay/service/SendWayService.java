package com.xlm.send.SendMessage.SendWay.service;

import com.xlm.send.pojo.SendWay;
import org.springframework.stereotype.Service;

@Service
public interface SendWayService {
    boolean SendWay(SendWay sendWay);
}
