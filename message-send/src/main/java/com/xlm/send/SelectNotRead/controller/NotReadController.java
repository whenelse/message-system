package com.xlm.send.SelectNotRead.controller;

import com.xlm.send.SelectNotRead.service.NotReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotReadController {

    @Autowired
    NotReadService notReadService;

    @RequestMapping("SelectAll")
    public int select(String userId){
        //查询所有模块的未读数量
        int modelNumber = notReadService.selectModelNotRead(userId);
        //查询公告的未读消息数
        int annoNumber = notReadService.selectAnnouncementNotRead(userId);
        return modelNumber+annoNumber;
    }
}
