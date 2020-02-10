package com.xlm.send.CreateModel.mapper;

import com.xlm.send.CreateModel.vo.TableHeadVo;
import org.springframework.stereotype.Component;

@Component
public interface CreateModelMapper {

    void createModelTable(TableHeadVo tableHeadVo);

}