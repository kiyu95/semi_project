package com.example.semi_project.dao;

import com.example.semi_project.dto.UserSelectDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // 이거 했을때 빈으로 등록되어서 Service 에서 사용 가능한건가?
public interface UserDAO {
    List<UserSelectDTO> selectAllUser();

    List<UserSelectDTO> searchUser(String criteria, String keyword);

    int deleteUser(String[] selectedUserCodeList);
}
