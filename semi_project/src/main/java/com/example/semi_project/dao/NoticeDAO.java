package com.example.semi_project.dao;

import com.example.semi_project.dto.NoticeSelectDTO;
import com.example.semi_project.dto.SearchNoticeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeDAO {
    List<NoticeSelectDTO> selectAllNotice();

    List<SearchNoticeDTO> searchNotice();

//    List<NoticeSelectDTO> searchNotice();
}
