package com.yn.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xw
 * @Description: 时间工具类
 * @Date: 15:24 2018/8/29
 */
public class DateUtils {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     *时间戳转换成String类型时间
     * @param time
     * @return
     */
    public static String TimeToString(Long time){
        String str = "";
        try {
            str =sdf.format(new Date(time));
        }catch (Exception e){
        }
        return str;
    }

    public static String TimeToString(String time){
        String str = "";
        try {
            str =sdf.format(new Date(Long.parseLong(time)));
        }catch (Exception e){
        }
        return str;
    }

    /**
     * String类型时间转换成时间戳
     * @param time
     * @return
     */
    public static Long StringToTime(String time){
        Long result = 0L;
        try {
            result = sdf.parse(time).getTime();
        }catch (Exception e){
        }
        return result;
    }

    /**
     * String类型时间戳时间转成Date类型
     * @param time
     * @return
     */
    public static Date LongToDate(String time){
        Date date = null;
        try {
            date = new Date(Long.parseLong(time));
        }catch (Exception e){
        }
        return date;
    }

    /**
     * String时间转成Date类型
     * @param time
     * @return
     */
    public static Date StringToDate(String time){
        Date date = null;
        try {
            date = sdf.parse(time);
        }catch (Exception e){
        }
        return date;
    }

    public static String getNow() {
        return sdf.format(new Date());
    }
}
