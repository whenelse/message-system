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
public class InstantMessage {
    private String uuid;

    private String insTemplateId;

    private String modelId;

    private String templateName;

    private String templateContent;

    private String templateDescription;

    private String status;

    private String createdBy;

    private Date createDate;

    private String lastModifiedBy;

    private Date lastModifiedDate;

}