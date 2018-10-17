package com.yn.module.service;import com.github.pagehelper.PageInfo;import com.yn.common.msg.ResultResponse;import com.yn.module.entity.*;import com.yn.module.mapper.FocusImageMapper;import com.yn.module.mapper.HomeLogoMapper;import com.yn.module.mapper.HomeShowMapper;import org.apache.commons.beanutils.BeanUtils;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import org.springframework.transaction.annotation.Transactional;import java.util.HashMap;import java.util.List;import java.util.Map;/** * @Author: xw * @Description: * @Date: 1:11 2018/10/3 */@Service@Transactional(readOnly = true)public class HomeService {    @Autowired    private HomeLogoMapper homeLogoMapper;    @Autowired    private HomeShowMapper homeShowMapper;    @Autowired    private FocusImageMapper focusImageMapper;    public ResultResponse getHomeLog(HomeLogo homeLogo) throws Exception{        return ResultResponse.success(homeLogoMapper.selectHomeLogo(homeLogo));    }    public ResultResponse getHomeShowList(HomeShow homeShow){        Map<String, Object> result = new HashMap();        if ("1".equals(homeShow.getLan())) {                homeShow.setCategoryId("Traditional Health Care Products");        }else {            homeShow.setCategoryId("传统医药保健品");        }        List<HomeShow> traditionalHomeShowList = homeShowMapper.selectHomeShowList(homeShow);        if ("1".equals(homeShow.getLan())) {            homeShow.setCategoryId("Medical Products");        }else {            homeShow.setCategoryId("医疗产品");        }        List<HomeShow> medicallHomeShowList = homeShowMapper.selectHomeShowList(homeShow);        if ("1".equals(homeShow.getLan())) {            homeShow.setCategoryId("Home Care");        }else {            homeShow.setCategoryId("家庭护理与关爱");        }        List<HomeShow> homeCareHomeShowList = homeShowMapper.selectHomeShowList(homeShow);        if ("1".equals(homeShow.getLan())) {            homeShow.setCategoryId("Health and Medical Services");        }else {            homeShow.setCategoryId("医疗健康服务");        }        List<HomeShow> healthHomeShowList = homeShowMapper.selectHomeShowList(homeShow);        result.put("traditionalHomeShowList",traditionalHomeShowList);        result.put("medicallHomeShowList",medicallHomeShowList);        result.put("homeCareHomeShowList",homeCareHomeShowList);        result.put("healthHomeShowList",healthHomeShowList);        return ResultResponse.success(result);    }    public ResultResponse getHomeLogEWM(HomeLogo homeLogo) throws Exception{        return ResultResponse.success(homeLogoMapper.selectHomeLogo(homeLogo));    }    public ResultResponse getFocusImage(String language) throws Exception{        FocusImage focusImage = new FocusImage();        HomeLogo homeLogo = new HomeLogo();        if ("C".equals(language)) {            focusImage.setId("cnhome1");            homeLogo.setId("cn1");        } else if ("E".equals(language)) {            focusImage.setId("enhome1");            homeLogo.setId("en1");        }        Map<String, Object> result = new HashMap<>();        FocusImage focusImageResult = focusImageMapper.selectFocusImage(focusImage);        HomeLogo homeLogoResult = homeLogoMapper.selectHomeLogo(homeLogo);        result.put("focusImage", focusImageResult);        result.put("homeLogo", homeLogoResult);        return ResultResponse.success(result);    }}