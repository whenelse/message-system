package com.xlm.send.pojo;

import java.util.Date;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public Integer getNotReading() {
        return notReading;
    }

    public void setNotReading(Integer notReading) {
        this.notReading = notReading;
    }

    public String getLastMessageTitle() {
        return lastMessageTitle;
    }

    public void setLastMessageTitle(String lastMessageTitle) {
        this.lastMessageTitle = lastMessageTitle == null ? null : lastMessageTitle.trim();
    }

    public Date getLastReadTime() {
        return lastReadTime;
    }

    public void setLastReadTime(Date lastReadTime) {
        this.lastReadTime = lastReadTime;
    }
}