package com.example.semi_project.dto;

public class ProposeSelectDTO {

    private int code;
    private String name;
    private int userCode;
    private String regist;
    private String status;

    public ProposeSelectDTO() {
    }

    public ProposeSelectDTO(int code, String name, int userCode, String regist, String status) {
        this.code = code;
        this.name = name;
        this.userCode = userCode;
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

    public int getUserCode() {
        return userCode;
    }

    public void setUserCode(int userCode) {
        this.userCode = userCode;
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
        return "ProposeSelectDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", userCode=" + userCode +
                ", regist='" + regist + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
