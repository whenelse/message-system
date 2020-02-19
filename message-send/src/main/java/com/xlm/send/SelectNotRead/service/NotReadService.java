package com.xlm.send.SelectNotRead.service;

import com.xlm.send.SelectNotRead.vo.ModelMessage;
import com.xlm.send.pojo.BlackModel;
import com.xlm.send.pojo.Message;
import com.xlm.send.pojo.UserModel;

import java.util.List;

public interface NotReadService {

    int selectModelNotRead(String userId);

    int selectAnnouncementNotRead(String userId);

    void addBlack(BlackModel blackModel);

    List<UserModel> selectUserModelNotRead(String userId);

    List<Message> selectUserModelMessage(ModelMessage message);
}
