package com.xlm.send.pojo;

public class App {
    private String uuid;

    private String appVersionNew;

    private String appType;

    private String osType;

    private String auroraAppkey;

    private String auroraMastersecret;

    private String auroraApnsProduction;

    private String status;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getAppVersionNew() {
        return appVersionNew;
    }

    public void setAppVersionNew(String appVersionNew) {
        this.appVersionNew = appVersionNew == null ? null : appVersionNew.trim();
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType == null ? null : appType.trim();
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType == null ? null : osType.trim();
    }

    public String getAuroraAppkey() {
        return auroraAppkey;
    }

    public void setAuroraAppkey(String auroraAppkey) {
        this.auroraAppkey = auroraAppkey == null ? null : auroraAppkey.trim();
    }

    public String getAuroraMastersecret() {
        return auroraMastersecret;
    }

    public void setAuroraMastersecret(String auroraMastersecret) {
        this.auroraMastersecret = auroraMastersecret == null ? null : auroraMastersecret.trim();
    }

    public String getAuroraApnsProduction() {
        return auroraApnsProduction;
    }

    public void setAuroraApnsProduction(String auroraApnsProduction) {
        this.auroraApnsProduction = auroraApnsProduction == null ? null : auroraApnsProduction.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}