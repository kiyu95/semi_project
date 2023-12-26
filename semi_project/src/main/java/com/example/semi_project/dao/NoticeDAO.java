package com.example.semi_project.dao;

import com.example.semi_project.dto.NoticeSelectDTO;
import com.example.semi_project.dto.SearchNoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeDAO {
    List<NoticeSelectDTO> selectAllNotice();

    List<SearchNoticeDTO> searchNotice(String keyword);

    int deleteNotice(String[] selectedNoticeCodeList);

    int registNotice(String name, String content);

//    List<DeleteNoticeDTO> selectedNoticeCodes(String selectedNoticeCodes);

//    void deleteNotices(String selectedNoticeCodes);
}
