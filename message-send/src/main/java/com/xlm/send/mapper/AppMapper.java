package com.xlm.send.mapper;

import com.xlm.send.pojo.App;

public interface AppMapper {
    int insert(App record);

    int insertSelective(App record);
}