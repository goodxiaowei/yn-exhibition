package com.yn.module.service;import com.github.pagehelper.PageInfo;import com.yn.common.msg.ResultResponse;import com.yn.module.entity.ExhibitorList;import com.yn.module.mapper.ExhibitorListMapper;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import java.util.List;/** * @Author: xw * @Description: * @Date: 11:19 2018/9/30 */@Service@Transactional(readOnly = true)public class ExhibitorListService {    @Autowired    private ExhibitorListMapper exhibitorListMapper;    public List<ExhibitorList> getExhibitorList(ExhibitorList exhibitorList){        return exhibitorListMapper.selectExhibitorList(exhibitorList);    }    public Integer getExhibitorListCount(ExhibitorList exhibitorList){        return exhibitorListMapper.selectExhibitorListCount(exhibitorList);    }}