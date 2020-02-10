package com.xlm.send.mapper;

import com.xlm.send.pojo.App;
import org.springframework.stereotype.Component;

@Component
public interface AppMapper {
    int insert(App record);

    int insertSelective(App record);
}