package com.xlm.send.mapper;

import com.xlm.send.pojo.Announcement;

public interface AnnouncementMapper {
    int insert(Announcement record);

    int insertSelective(Announcement record);
}