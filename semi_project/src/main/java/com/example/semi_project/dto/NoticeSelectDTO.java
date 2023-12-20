package com.example.semi_project.dto;

public class NoticeSelectDTO {

    private int code;
    private String name;
    private String regist;
    private String status;

    public NoticeSelectDTO() {
    }

    public NoticeSelectDTO(int code, String name, String regist, String status) {
        this.code = code;
        this.name = name;
        this.regist = regist;
        this.status = status;
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

    @Override
    public String toString() {
        return "NoticeSelectDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", regist='" + regist + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
