package com.example.semi_project.service;

import com.example.semi_project.dao.NoticeDAO;
import com.example.semi_project.dto.NoticeSelectDTO;
import com.example.semi_project.dto.SearchNoticeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class NoticeService {

    @Autowired
    private NoticeDAO noticeDAO;

    public List<NoticeSelectDTO> selectAllNotice() {
        List<NoticeSelectDTO> noticeList = noticeDAO.selectAllNotice(); // notice를 List형으로 꺼내옴
        if (Objects.isNull(noticeList)) { // noticeDAO.selectAllNotice() 에서 반환된 값이 없을 경우
            System.out.println("등록된 공지사항이 없습니다.");
        }
        return noticeList; // noticeDAO.selectALLNotice() 에서 반환된 값 반환
    }

    public List<SearchNoticeDTO> searchNotice() {
        List<SearchNoticeDTO> searchNotice = noticeDAO.searchNotice();

        return searchNotice;
    }

//    public List<NoticeSelectDTO> searchNotice() {
//        List<NoticeSelectDTO> searchNotice = noticeDAO.searchNotice();
//
//        return searchNotice;
//    }
}
