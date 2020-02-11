package com.xlm.send.mapper;

import com.xlm.send.pojo.BlackModel;

public interface BlackModelMapper {
    int insert(BlackModel record);

    int insertSelective(BlackModel record);
}