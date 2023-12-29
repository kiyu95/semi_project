package com.example.semi_project.dao;

import com.example.semi_project.dto.RecommendSelectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RecommendDAO {
    List<RecommendSelectDTO> selectAllRecommend();

    List<RecommendSelectDTO> selectAllRecommend(String criteria, String keyword);

    int registRecommend(int categoryCode, String content);

    int deleteRecommend(String[] selectedRecommendCodeList);

    int modifyRecommend(int recommendCode, int categoryCode, String content);
}
