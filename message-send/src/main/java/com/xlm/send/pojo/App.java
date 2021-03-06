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
public class App {
    private String uuid;

    private String appAbbreviation;

    private String appVersionNew;

    private String appType;

    private String osType;

    private String auroraAppkey;

    private String auroraMastersecret;

    private String auroraApnsProduction;

    private String status;

}