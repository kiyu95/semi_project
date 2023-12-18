package com.example.semi_project.dto;

public class UserSelectDTO {

    private int code;
    private String email;
    private String regist;
    private String status;

    public UserSelectDTO() {
    }

    public UserSelectDTO(int code, String email, String regist, String status) {
        this.code = code;
        this.email = email;
        this.regist = regist;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "UserSelectDTO{" +
                "code=" + code +
                ", email='" + email + '\'' +
                ", regist='" + regist + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
