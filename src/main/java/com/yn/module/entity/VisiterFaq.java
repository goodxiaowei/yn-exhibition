package com.yn.module.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * visiter_faq实体类
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VisiterFaq {
    /***/
    private String id;
    /**
     * 标题
     */
    private String title;
    /**
     * 问题
     */
    private String faq;
    /**
     * 说明
     */
    private String explanation;
    /**
     * 排序
     */
    private BigDecimal sort;
    /**
     * 语言
     */
    private String lan;
    /***/
    private String delFlag;
}
