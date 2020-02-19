package com.xlm.send.mapper;

import com.xlm.send.pojo.BlackModel;
import org.springframework.stereotype.Component;

@Component
public interface BlackModelMapper {
    int addBlackModel(BlackModel record);

}