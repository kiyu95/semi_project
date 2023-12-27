package com.example.semi_project.service;

import com.example.semi_project.dao.ProposeDAO;
import com.example.semi_project.dto.ProposeAnswerDTO;
import com.example.semi_project.dto.ProposeSelectDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ProposeService {

    @Autowired
    private ProposeDAO proposeDAO;

    public List<ProposeSelectDTO> selectAllPropose() {
        List<ProposeSelectDTO> proposeList = proposeDAO.selectAllPropose();

        if (Objects.isNull(proposeList)) {
            System.out.println("등록된 문의사항이 없습니다.");
        }

        return proposeList;
    }


    public ProposeAnswerDTO proposeAnswer(int proposeCode, String proposeName) {
        ProposeAnswerDTO answer = proposeDAO.proposeAnswer(proposeCode, proposeName);

        return answer;
    }

    public int answerRegist(String proposeAnswer, int proposeCode) {
        int result = proposeDAO.answerRegist(proposeAnswer, proposeCode);

        return result;
    }
}
