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
public class UserModel {
    private String uuid;

    private String userId;

    private String modelId;

    private Integer notReading;

    private String lastMessageTitle;

    private Date lastReadTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}