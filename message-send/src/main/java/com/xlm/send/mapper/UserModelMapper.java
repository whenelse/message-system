package com.xlm.send.mapper;

import com.xlm.send.pojo.UserModel;

public interface UserModelMapper {
    int insert(UserModel record);

    int insertSelective(UserModel record);
}