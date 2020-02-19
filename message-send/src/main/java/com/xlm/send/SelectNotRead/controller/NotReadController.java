package com.xlm.send.SelectNotRead.controller;

import com.xlm.send.SelectNotRead.service.NotReadService;
import com.xlm.send.SelectNotRead.vo.ModelMessage;
import com.xlm.send.pojo.BlackModel;
import com.xlm.send.pojo.Message;
import com.xlm.send.pojo.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/notRead")
public class NotReadController {

    @Autowired
    NotReadService notReadService;

    /**
     * @Description //查询所有未读消息数
     * @Author xia_shibo
     * @Date  11:47
     * @Param [userId]
     * @return int
     */
    @RequestMapping("/selectAll")
    public int select(String userId){
        //查询所有模块的未读数量
        int modelNumber = notReadService.selectModelNotRead(userId);
        //查询公告的未读消息数
        int annoNumber = notReadService.selectAnnouncementNotRead(userId);
        return modelNumber+annoNumber;
    }

    /**
     * @Description //查询各模块信息
     * @Author xia_shibo
     * @Date  16:05
     * @Param [userId]
     * @return java.util.List<com.xlm.send.pojo.UserModel>
     */
    @RequestMapping("/selectList")
    public List<UserModel> selectList(String userId){
        return notReadService.selectUserModelNotRead(userId);
    }


    /**
     * @Description //查看消息内容
     * @Author xia_shibo
     * @Date  13:47
     * @Param [userId, modelId]
     * @return java.util.List<com.xlm.send.pojo.Message>
     */
    @RequestMapping("/selectMessage")
    public List<Message> selectMessage(String userId,String modelId){
        ModelMessage message = new ModelMessage();
        message.setUserId(userId);
        return notReadService.selectUserModelMessage(message);
    }

    /**
     * @Description //添加黑名单
     * @Author xia_shibo
     * @Date  16:06
     * @Param [blackModel]
     * @return void
     */
    @RequestMapping("/addBlack")
    public void addBlack(@RequestBody BlackModel blackModel){
        blackModel.setUuid(UUID.randomUUID().toString());
        blackModel.setStatus("01");
        notReadService.addBlack(blackModel);
    }
}
