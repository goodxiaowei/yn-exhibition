package com.yn.module.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * exhibitor_floorplan实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExhibitorFloorplan {
    /***/
    private String id;
    /**
     * 标题
     */
    private String title;
    /**
     * 时间
     */
    private String flTime;
    /**
     * 图片
     */
    private String image;
    /**
     * 语言
     */
    private String lan;
    /***/
    private String updateDate;
    /***/
    private String delFlag;
}
