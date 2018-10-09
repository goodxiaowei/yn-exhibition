package com.yn.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * exhibitor_list实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExhibitorList {
    /**
     * ID
     */
    private String id;
    /**
     * 标题
     */
    private String title;
    /**
     * 地区
     */
    private String region;
    /**
     * 展位编号
     */
    private String standNo;
    /**
     * 缩略图
     */
    private String image;
    /**
     * 内容
     */
    private String content;
    /**
     * 展会产品
     */
    private String products;
    /**
     * 产品类型
     */
    private String categoies;
    /**
     * 语言
     */
    private String lan;
    /**
     * 排序
     */
    private Double sort;
    /**
     * 置顶
     */
    private String top;
    /***/
    private String createDate;
    /***/
    private String updateDate;
    /**
     * 备注
     */
    private String remark;
    /***/
    private String delFlag;
}
