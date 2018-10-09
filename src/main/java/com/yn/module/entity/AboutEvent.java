package com.yn.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * about_event实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AboutEvent {
    /**
     * ID en1 英文 cn1 中文
     */
    private String id;
    /**
     * 标题
     */
    private String titel;
    /**
     * 二级标题
     */
    private String twoTitel;
    /**
     * 图片
     */
    private String imge;
    /**
     * 时间
     */
    private String eventDate;
    /**
     * 地点
     */
    private String location;
    /**
     * 展品范围
     */
    private String featuredRange;
    /**
     * 参展范围
     */
    private String exhibitionScope;
    /**
     * 观众群体
     */
    private String visitorProfile;
    /**
     * 观众类别
     */
    private String productCategories;
    /**
     * 参展频率
     */
    private String featuredPavilions;
    /**
     * 展会特色
     */
    private String exhibitionFeatures;
    /**
     * 主办单位
     */
    private String organizer;
    /**
     * 语言
     */
    private String lan;
    /**
     * 删除标记
     */
    private String delFlag;

}
