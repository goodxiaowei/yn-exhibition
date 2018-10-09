package com.yn.module.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * exhibit_team实体类
 *
 * @author
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExhibitTeam {
    /***/
    private String id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 头像
     */
    private String image;
    /**
     * 手机号
     */
    private String phone;
    /**
     * mail
     */
    private String mail;
    /**
     * 排序
     */
    private Double sort;
    /**
     * 语言
     */
    private String lan;
    /***/
    private String delFlag;
    /***/
    private String updateDate;
}
