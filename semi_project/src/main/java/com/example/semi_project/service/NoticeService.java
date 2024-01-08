package com.example.semi_project.service;

import com.example.semi_project.dao.NoticeDAO;
import com.example.semi_project.dto.NoticeSelectDTO;
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

    public List<NoticeSelectDTO> searchNotice(String criteria, String keyword) {
        List<NoticeSelectDTO> noticeList = noticeDAO.searchNotice(criteria, keyword);

        return noticeList;
    }

    public int deleteSelectedNotices(String[] selectedNoticeCodeList) {

        int result = noticeDAO.deleteNotice(selectedNoticeCodeList);

        return result;

    }

    public int registNotice(String name, String content) {
        int result = noticeDAO.registNotice(name, content);

        return result;
    }

    public int modifyNotice(int noticeCode, String name, String content) {
        int result = noticeDAO.modifyNotice(noticeCode, name, content);

        return result;
    }
}
