package com.example.semi_project.dto;

public class RecommendSelectDTO {

    private int recommendCode;
    private int categoryCode;
    private String categoryName;
    private String content;

    public RecommendSelectDTO(int recommendCode, int categoryCode, String categoryName, String content) {
        this.recommendCode = recommendCode;
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.content = content;
    }

    public int getRecommendCode() {
        return recommendCode;
    }

    public void setRecommendCode(int recommendCode) {
        this.recommendCode = recommendCode;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
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
                "recommendCode=" + recommendCode +
                ", categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
