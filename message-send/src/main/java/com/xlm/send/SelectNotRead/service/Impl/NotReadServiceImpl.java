package com.xlm.send.SelectNotRead.service.Impl;

import com.xlm.send.SelectNotRead.service.NotReadService;
import com.xlm.send.mapper.AnnouncementMapper;
import com.xlm.send.mapper.MessageMapper;
import com.xlm.send.mapper.UserModelMapper;
import com.xlm.send.pojo.Announcement;
import com.xlm.send.pojo.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotReadServiceImpl implements NotReadService {

    @Autowired
    UserModelMapper userModelMapper;

    @Autowired
    AnnouncementMapper announcementMapper;

    @Autowired
    MessageMapper messageMapper;


    /**
     * @Description //查询模块未读消息数
     * @Author xia_shibo
     * @Date  16:24
     * @Param [userId]
     * @return java.util.List<com.xlm.send.pojo.UserModel>
     */
    @Override
    public int selectModelNotRead(String userId) {
        int numbers = 0;
        List<UserModel> userModelList = userModelMapper.selectModelNotRead(userId);
        for (UserModel um:userModelList) {
            numbers+=um.getNotReading();
        }
        return numbers;
    }

    /**
     * @Description //查询公告未读消息数
     * @Author xia_shibo
     * @Date  17:25
     * @Param [userId]
     * @return int
     */
    @Override
    public int selectAnnouncementNotRead(String userId) {
        Announcement announcement = announcementMapper.selectLastReadTime(userId);

        return messageMapper.selectNumByTime("1",announcement.getLastReadTime());
    }
}
