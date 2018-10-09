package com.yn.module.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * home_logo实体类
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HomeLogo {
    /***/
    private String id;
    /**
     * LOGO
     */
    private String logo;
    /**
     * 时间
     */
    private String times;
    /**
     * 地点
     */
    private String wheres;
    /**
     * 语言
     */
    private String lan;
    /**
     * 备注
     */
    private String remarks;
    /**
     * BookAStand
     */
    private String bookAStand;
}
