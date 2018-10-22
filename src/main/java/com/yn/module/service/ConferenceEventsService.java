package com.yn.module.service;

import com.github.pagehelper.PageInfo;
import com.yn.common.msg.ResultResponse;
import com.yn.module.entity.ConferenceEvents;
import com.yn.module.mapper.ConferenceEventsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @Author: xw
 * @Description:
 * @Date: 18:23 2018/9/26
 */
@Service
@Transactional(readOnly = true)
public class ConferenceEventsService {

    @Autowired
    private ConferenceEventsMapper conferenceEventsMapper;

    public List<ConferenceEvents> getConferenceEventsList(ConferenceEvents conferenceEvents){
        return conferenceEventsMapper.selectConferenceEventsList(conferenceEvents);
    }

    public Integer getConferenceEventsCount(ConferenceEvents conferenceEvents){
        return conferenceEventsMapper.selectConferenceEventsCount(conferenceEvents);
    }

    public ConferenceEvents getConferenceEvents(ConferenceEvents conferenceEvents){
        return conferenceEventsMapper.selectConferenceEvents(conferenceEvents);
    }
}
