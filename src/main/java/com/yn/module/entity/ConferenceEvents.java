package com.yn.module.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * conference_events实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConferenceEvents {
    /**
     * ID
     */
    private String id;
    /**
     * 产品分类
     */
    private String organizer;
    /**
     * 序号
     */
    private String nem;
    /**
     * 链接
     */
    private String link;
    /**
     * 会议活动名称
     */
    private String eventName;
    /**
     * 活动日期
     */
    private String eventDate;
    /**
     * 正文
     */
    private String content;
    /**
     * 地点
     */
    private String location;
    /**
     * 排序
     */
    private Double sort;
    /***/
    private String createDate;
    /***/
    private String updateDate;
    /**
     * 语言
     */
    private String lan;
    /**
     * 备注
     */
    private String remark;
    /***/
    private String delFlag;
}
