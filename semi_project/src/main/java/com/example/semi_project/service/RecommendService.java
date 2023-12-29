package com.example.semi_project.service;

import com.example.semi_project.dao.RecommendDAO;
import com.example.semi_project.dto.RecommendSelectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendService {

    @Autowired
    private RecommendDAO recommendDAO;

    public List<RecommendSelectDTO> selectAllRecommend() {

        List<RecommendSelectDTO> recommendList = recommendDAO.selectAllRecommend();

        return recommendList;
    }

    public List<RecommendSelectDTO> selectAllRecommend(String criteria, String keyword) {

        List<RecommendSelectDTO> recommendList = recommendDAO.selectAllRecommend(criteria, keyword);

        return recommendList;
    }

    public int registRecommend(int categoryCode, String content) {

        int result = recommendDAO.registRecommend(categoryCode, content);

        return result;
    }

    public int deleteRecommend(String[] selectedRecommendCodeList) {

        int result = recommendDAO.deleteRecommend(selectedRecommendCodeList);

        return result;
    }

    public int modifyRecommend(int recommendCode, int categoryCode, String content) {

        int result = recommendDAO.modifyRecommend(recommendCode, categoryCode, content);

        return result;
    }

}
