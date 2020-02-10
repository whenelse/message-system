package com.xlm.send.CreateModel.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ModelInfomationVo {

    private String modelName;

    private String appId;

    private String createrId;

    private String modelType;
}
