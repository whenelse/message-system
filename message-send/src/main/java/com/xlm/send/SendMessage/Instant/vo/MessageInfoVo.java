package com.xlm.send.SendMessage.Instant.vo;

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
public class MessageInfoVo {
    private String modelId;
    private String messageId;
    private String userId;
    private String title;
    private String content;
    private String createId;
}
