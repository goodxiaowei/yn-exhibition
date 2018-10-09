package com.yn.module.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * visiter_option实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisiterOption {
    /**
     * ID
     */
    private String id;
    /**
     * 名称
     */
    private String name;
    /**
     * 类别
     */
    private String category;
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
}
