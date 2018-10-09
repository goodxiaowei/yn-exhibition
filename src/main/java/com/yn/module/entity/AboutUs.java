package com.yn.module.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * about_us实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AboutUs {
    /**
     * ID
     */
    private String id;
    /**
     * 主办单位
     */
    private String organizers;
    /**
     * 标题
     */
    private String titel;
    /**
     * 内容
     */
    private String content;
    /**
     * LOGO
     */
    private String logo;
    /**
     * 排序
     */
    private Double sort;
    /**
     * 创建时间
     */
    private String createDate;
    /**
     * 更新时间
     */
    private String updateDate;
    /**
     * 语言
     */
    private String lan;
    /**
     * 删除标志
     */
    private String delFlag;

}
