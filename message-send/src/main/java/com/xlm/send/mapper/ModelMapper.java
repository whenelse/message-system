package com.xlm.send.mapper;

import com.xlm.send.pojo.Model;
import org.springframework.stereotype.Component;

@Component
public interface ModelMapper {
    int insert(Model record);

    int insertSelective(Model record);
}