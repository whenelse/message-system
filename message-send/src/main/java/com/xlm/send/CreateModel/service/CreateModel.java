package com.xlm.send.CreateModel.service;

import com.xlm.send.CreateModel.vo.ModelInfomationVo;
import org.springframework.stereotype.Service;

/**
 * 创建即时消息模块
 * @Author jiangyuanchu
 */

@Service
public interface CreateModel {

    boolean createModel(ModelInfomationVo modelInfomationVo);

}
