package com.yn.module.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * home_show实体类
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeShow {
    /**
     * ID
     */
    private String id;
    /**
     * 分类
     */
    private String categoryId;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 缩略图
     */
    private String image;
    /**
     * 语言
     */
    private String lan;
    /**
     * 排序
     */
    private Double sort;
    /**
     * 使用状态
     */
    private Integer useType;
    /***/
    private String createDate;
    /***/
    private String updateDate;
    /***/
    private String delFlag;
}
