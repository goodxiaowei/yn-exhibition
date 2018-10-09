package com.yn.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * focus_image实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FocusImage {
    /***/
    private String id;
    /***/
    private String imageName;
    /***/
    private String imageDesc;
    /***/
    private String iamgeContent;
    /***/
    private Integer openType;
    /***/
    private Integer imageNum;
    /***/
    private Integer useType;
    /***/
    private String createId;
    /***/
    private String createDate;
    /***/
    private String imageUrl;
    /***/
    private String imagePath;
    /***/
    private String imageHref;
    /***/
    private Integer positionType;
    /***/
    private Integer websiteType;
    /***/
    private String categoryId;

}
