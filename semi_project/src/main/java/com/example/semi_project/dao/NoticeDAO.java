package com.example.semi_project.dao;

import com.example.semi_project.dto.NoticeSelectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeDAO {
    List<NoticeSelectDTO> selectAllNotice();

    List<NoticeSelectDTO> searchNotice(String criteria, String keyword);

    int deleteNotice(String[] selectedNoticeCodeList);

    int registNotice(String name, String content);

    int modifyNotice(int noticeCode, String name, String content);
}
