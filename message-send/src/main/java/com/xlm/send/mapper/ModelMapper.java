package com.xlm.send.mapper;

import com.xlm.send.pojo.Model;

public interface ModelMapper {
    int insert(Model record);

    int insertSelective(Model record);
}