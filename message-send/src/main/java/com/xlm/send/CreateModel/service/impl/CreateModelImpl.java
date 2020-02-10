package com.xlm.send.CreateModel.service.impl;

import com.xlm.send.CreateModel.mapper.CreateModelMapper;
import com.xlm.send.CreateModel.service.CreateModel;
import com.xlm.send.CreateModel.vo.ModelInfomationVo;
import com.xlm.send.CreateModel.vo.TableHeadVo;
import com.xlm.send.mapper.ModelMapper;
import com.xlm.send.pojo.Model;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;

public class CreateModelImpl implements CreateModel {

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    CreateModelMapper createModelMapper;

    @Override
    public boolean createModel(ModelInfomationVo modelInfomationVo) {
        boolean status = true;
        Date date = new Date();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        Model model = Model.builder().uuid(uuid).appId(modelInfomationVo.getAppId())
                .modelName(modelInfomationVo.getModelName())
                .createTime(date).modelType(modelInfomationVo.getModelType())
                .createrId(modelInfomationVo.getCreaterId())
                .status("01").build();


        try{
            modelMapper.insert(model);
        }catch (Exception e){
            System.err.println("数据库表添加记录异常");
            e.printStackTrace();
        }finally {
            status = false;
        }

        TableHeadVo tableHeadVo = TableHeadVo.builder().appId(modelInfomationVo.getAppId())
                .modelId(uuid).build();
        try{
            createModelMapper.createModelTable(tableHeadVo);
        }catch (Exception e){
            System.err.println("数据库表创建异常");
            e.printStackTrace();
        }finally {
            status = false;
        }

        return status;
    }
}
