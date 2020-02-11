package com.xlm.send.mapper;

import com.xlm.send.pojo.UserModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserModelMapper {

    List<UserModel> selectModelNotRead(String userId);
}