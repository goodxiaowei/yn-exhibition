package com.yn.module.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * exhibit_why实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExhibitWhy {
    /***/
    private String id;
    /**
     * 分类
     */
    private String sort;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String concent;
    /**
     * 图片
     */
    private String image;
    /***/
    private String link;
    /**
     * 语言
     */
    private String lan;
    /***/
    private String delFlag;
    /***/
    private String updateDate;
}
