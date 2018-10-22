package com.yn.module.mapper;

import com.yn.module.entity.ConferenceEvents;

import java.util.List;

/**
 * @Author: xw
 * @Description:
 * @Date: 18:21 2018/9/26
 */
public interface ConferenceEventsMapper {
    public List<ConferenceEvents> selectConferenceEventsList(ConferenceEvents conferenceEvents);

    public Integer selectConferenceEventsCount(ConferenceEvents conferenceEvents);

    public ConferenceEvents selectConferenceEvents(ConferenceEvents conferenceEvents);

}
