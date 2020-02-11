package com.xlm.send.SelectNotRead.service;


public interface NotReadService {

    int selectModelNotRead(String userId);

    int selectAnnouncementNotRead(String userId);
}
