package com.xlm.send.mapper;

import com.xlm.send.pojo.UserModel;
import org.springframework.stereotype.Component;

@Component
public interface UserModelMapper {
    int insert(UserModel record);

    int insertSelective(UserModel record);
}