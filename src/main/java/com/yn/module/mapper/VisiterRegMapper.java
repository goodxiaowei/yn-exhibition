package com.yn.module.mapper;

import com.yn.module.entity.VisiterReg;

/**
 * @Author: xw
 * @Description:
 * @Date: 12:44 2018/10/5
 */
public interface VisiterRegMapper {

    public Integer insertVisiterReg(VisiterReg visiterReg);

    public VisiterReg select(VisiterReg visiterReg);

    public String queryMaxNum();
}
