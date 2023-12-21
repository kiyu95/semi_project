package com.example.semi_project.dto;

public class SearchNoticeDTO {

    private int code;
    private String name;
    private String regist;
    private String status;
    private String keyword;

    public SearchNoticeDTO(int code, String name, String regist, String status, String keyword) {
        this.code = code;
        this.name = name;
        this.regist = regist;
        this.status = status;
        this.keyword = keyword;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegist() {
        return regist;
    }

    public void setRegist(String regist) {
        this.regist = regist;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "SearchNoticeDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", regist='" + regist + '\'' +
                ", status='" + status + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
