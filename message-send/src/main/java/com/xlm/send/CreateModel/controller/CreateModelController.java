package com.xlm.send.CreateModel.controller;

import com.xlm.send.CreateModel.service.CreateModel;
import com.xlm.send.CreateModel.vo.ModelInfomationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 创建即时消息模块
 * @Author jiangyuanchu
 */

@RestController
public class CreateModelController {

    @Autowired
    CreateModel createModel;

    @RequestMapping(value = "createModel",method = RequestMethod.POST)
    public boolean CreateModel(@RequestBody ModelInfomationVo modelInfomationVo){
        return createModel.createModel(modelInfomationVo);
    }
}
