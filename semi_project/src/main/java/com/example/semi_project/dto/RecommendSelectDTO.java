package com.example.semi_project.dto;

public class RecommendSelectDTO {

    private int code;
    private String categoryName;
    private String content;

    public RecommendSelectDTO(int code, String categoryName, String content) {
        this.code = code;
        this.categoryName = categoryName;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "RecommendSelectDTO{" +
                "code=" + code +
                ", categoryName='" + categoryName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
