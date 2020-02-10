package com.xlm.send.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Model {
    private String uuid;

    private String modelName;

    private String appId;

    private Date createTime;

    private String createrId;

    private String modelType;

    private String status;

}