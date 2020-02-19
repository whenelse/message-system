package com.xlm.send.SelectNotRead.service.Impl;

import com.xlm.send.SelectNotRead.service.NotReadService;
import com.xlm.send.SelectNotRead.vo.ModelMessage;
import com.xlm.send.mapper.*;
import com.xlm.send.pojo.Announcement;
import com.xlm.send.pojo.BlackModel;
import com.xlm.send.pojo.Message;
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

    @Autowired
    BlackModelMapper blackModelMapper;


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
     * @Description //查询各模块信息
     * @Author xia_shibo
     * @Date  16:06
     * @Param [userId]
     * @return java.util.List<com.xlm.send.pojo.UserModel>
     */
    @Override
    public List<UserModel> selectUserModelNotRead(String userId) {
        return userModelMapper.selectModelNotRead(userId);
    }

    /**
     * @Description //查询消息内容
     * @Author xia_shibo
     * @Date  13:38
     * @Param [message]
     * @return java.util.List<com.xlm.send.pojo.Message>
     */
    @Override public List<Message> selectUserModelMessage(ModelMessage modelMessage) {

        return messageMapper.selectMessageByUserAndModel(modelMessage);
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




    /**
     * @Description //添加黑名单
     * @Author xia_shibo
     * @Date  13:36
     * @Param [blackModel]
     * @return void
     */
    @Override
    public void addBlack(BlackModel blackModel) {
        blackModelMapper.addBlackModel(blackModel);
    }


}
