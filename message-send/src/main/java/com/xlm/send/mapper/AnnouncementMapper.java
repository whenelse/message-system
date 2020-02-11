package com.xlm.send.mapper;

import com.xlm.send.pojo.Announcement;
import org.springframework.stereotype.Component;

@Component
public interface AnnouncementMapper {

    Announcement selectLastReadTime(String userId);
}