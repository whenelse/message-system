package com.xlm.send.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Model {
    private int id;

    private String modelName;

    private String appId;

    private Date createTime;

    private String createrId;

    private String modelType;

    private String status;

}