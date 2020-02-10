package com.xlm.send.pojo;

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
public class SendWay {
    private String uuid;

    private String appId;

    private String messageId;

    private String wechatId;

    private String emailId;

    private String noteId;

    private String insTemplateId;

    private String pushId;

}