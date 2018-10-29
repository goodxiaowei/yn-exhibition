package com.yn.module.service;

import com.github.pagehelper.PageInfo;
import com.yn.common.msg.ResultResponse;
import com.yn.module.entity.*;
import com.yn.module.mapper.ExhibitWhyMapper;
import com.yn.module.mapper.ExhibitorFloorplanMapper;
import com.yn.module.mapper.TravelMapper;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: xw
 * @Description:
 * @Date: 1:41 2018/10/3
 */
@Service
@Transactional(readOnly = true)
public class ExhibitService {

    @Autowired
    private ExhibitorFloorplanMapper exhibitorFloorplanMapper;
    @Autowired
    private ExhibitWhyMapper exhibitWhyMapper;
    @Autowired
    private TravelMapper travelMapper;

    public ResultResponse getExhibitWhy(ExhibitWhy exhibitWhy){
        return ResultResponse.success(exhibitWhyMapper.selectExhibitWhy(exhibitWhy));
    }

    public ResultResponse getExhibitorFloorplan(ExhibitorFloorplan exhibitorFloorplan){
        return ResultResponse.success(exhibitorFloorplanMapper.selectExhibitorFloorplan(exhibitorFloorplan));
    }

    public ResultResponse getTimeLocation(ExhibitWhy whenWhere, ExhibitWhy travel) throws Exception{
        WhenWhere whenWhereResult = new WhenWhere();
        TravelInformation travelInformation = new TravelInformation();
        Travel travelParam = new Travel();
        BeanUtils.copyProperties(whenWhereResult, exhibitWhyMapper.selectExhibitWhy(whenWhere));
        BeanUtils.copyProperties(travelInformation, exhibitWhyMapper.selectExhibitWhy(travel));
        travelParam.setLan("travel1".equals(travel.getId())?"1":"0");
        List<Travel> travelList = travelMapper.selectTravelList(travelParam);
        for(Travel travel1:travelList){
            List<Map<String,Object>> trapMapList = new ArrayList<>();
            String trap = travel1.getTrap();
            List<String> trapList = Arrays.asList(trap.split("split"));
            for(String trapStr:trapList){
                Map<String ,Object> map = new HashedMap();
                map.put("content", trapStr);
                trapMapList.add(map);
            }
            travel1.setTrap(null);
            travel1.setList(trapMapList);
        }
        travelInformation.setTravelList(travelList);
        TimeLocation timeLocation = new TimeLocation(whenWhereResult, travelInformation);
        return ResultResponse.success(timeLocation);
    }
}
