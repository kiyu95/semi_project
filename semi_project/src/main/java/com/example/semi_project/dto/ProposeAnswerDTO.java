package com.example.semi_project.dto;

public class ProposeAnswerDTO {

    private String auth;

    public ProposeAnswerDTO(String auth) {
        this.auth = auth;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    @Override
    public String toString() {
        return "ProposeAnswerDTO{" +
                "auth='" + auth + '\'' +
                '}';
    }
}

