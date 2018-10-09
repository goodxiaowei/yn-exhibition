package com.yn.module.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * visiter_reg实体类
 *
 * @author
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisiterReg {
    /**
     * ID
     */
    private String id;
    /**
     * 编号
     */
    private String num;
    /**
     * 活动ID
     */
    private String conferenceEventsId;
    /**
     * 姓
     */
    private String surname;
    /**
     * 名
     */
    private String firstName;
    /**
     * 电子邮件
     */
    private String email;
    /**
     * 公司
     */
    private String company;
    /**
     * 职位
     */
    private String jobTitle;
    /**
     * 号码
     */
    private String mobile;
    /**
     * phone
     */
    private String phone;
    /**
     * 邮编
     */
    private String code;
    /**
     * 公司地址
     */
    private String companyAdress;
    /**
     * 省
     */
    private String province;
    /**
     * 市
     */
    private String city;
    /**
     * 街道
     */
    private String street;
    /**
     * 商业性质
     */
    private String businessNature;
    /**
     * HNC
     */
    private String hnc;
    /**
     * 目的
     */
    private String purpose;
    /**
     * 创建时间
     */
    private String createDate;
    /**
     * 语言
     */
    private String lan;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 删除标记
     */
    private String delFlag;
    /**
     * 审核
     */
    private String audit;
}
