package com.yn.common.msg;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: xw
 * @Description:
 * @Date: 14:31 2018/8/25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultResponse<T> implements Serializable{

    private static final Integer SUCC_CODE = 200;
    private static final Integer FAIL_CODE = 500;
    private static String SUCC_MSG = "请求成功";
    private static String FAIL_MSG = "请求失败";
    private Integer code;
    private String msg;
    private T data;
    private Integer pageNum = 1;//起始条数
    private Integer pageSize = 10;//每页显示条数
    private Integer pageCount;//总页数
    private Integer totalCount;//总条数

    public ResultResponse addMsg(String msg){
        this.msg = msg;
        return this;
    }

    public static <T> ResultResponse success(T object){
        ResultResponse<T> result = new ResultResponse<T>();
        result.setCode(SUCC_CODE);
        result.setMsg(SUCC_MSG);
        result.setPageSize(null);
        result.setPageNum(null);
        result.setData(object);
        return  result;
    }

    public static <T> ResultResponse fail(T object){
        ResultResponse result = new ResultResponse();
        result.setCode(FAIL_CODE);
        result.setMsg(FAIL_MSG);
        result.setPageSize(null);
        result.setPageNum(null);
        result.setData(object);
        return result;
    }

    public static <T> ResultResponse successList(PageInfo<T> page){
        ResultResponse result = new ResultResponse(SUCC_CODE, SUCC_MSG, page.getList(), page.getPageNum(), page.getPageSize(), page.getPages(), page.getSize());
        return result;
    }

    public static <T> ResultResponse successList(PageInfo<T> page, Integer totalCount){
        ResultResponse result = new ResultResponse(SUCC_CODE, SUCC_MSG, page.getList(), page.getPageNum(), page.getPageSize(), page.getPages(), totalCount);
        return result;
    }
}
