package com.example.semi_project.dao;

import com.example.semi_project.dto.ProposeAnswerDTO;
import com.example.semi_project.dto.ProposeSelectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminProposeDAO {
    List<ProposeSelectDTO> selectAllPropose();

    ProposeAnswerDTO proposeAnswer(int proposeCode, String proposeName);

    int answerRegist(String proposeAnswer, int proposeCode);

    int deletePropose(String[] selectedProposeCodeList);

    List<ProposeSelectDTO> selectAllPropose(String criteria, String keyword);
}
