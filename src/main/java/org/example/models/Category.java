package org.example.models;

public class Category {
    public Category(){}

    public Category(String categoryName, int categoryId){
        this.categoryName = categoryName;
        this.categoryId= categoryId;
    }

    private int categoryId;
    private String categoryName;

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
