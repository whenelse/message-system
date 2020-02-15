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
public class MessageContent {

    private String appId;
    private String modelId;
    private String uuid;
    private String messageId;
    private String userId;
    private String title;
    private String content;
    private String isRead;
    private Date createTime;
    private String createId;

}
