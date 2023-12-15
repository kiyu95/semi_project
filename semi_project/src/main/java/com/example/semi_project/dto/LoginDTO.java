package com.example.semi_project.dto;

public class LoginDTO {
    private String id;
    private int pass;

    public LoginDTO() {
    }

    public LoginDTO(String id, int pass) {
        this.id = id;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "id='" + id + '\'' +
                ", pass=" + pass +
                '}';
    }
}
