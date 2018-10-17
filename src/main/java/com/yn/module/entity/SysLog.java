package com.yn.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by xiaow on 2018/10/17.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysLog {
    private String id;
    private String type;
    private String title;
    private String createBy;
    private Date createDate;
    private String remoteAddr;
    private String userAgent;
    private String requestUri;
    private String method;
    private String params;
    private String exception;
}
