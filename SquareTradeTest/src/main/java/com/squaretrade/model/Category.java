package com.squaretrade.model;


import java.util.Locale;

public class Category  {

    private Integer idCategory;



    private String nameCategory;
    private String keyWords;
    private Integer paretCategory;
    Category() {
    }

    public Category(Integer idCategory, String nameCategory, String keyWords, Integer paretCategory) {
        this.setIdCategory(idCategory);
        this.setNameCategory(nameCategory);
        this.setKeyWords(keyWords);
        this.setParetCategory(paretCategory);
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public Integer getParetCategory() {
        return paretCategory;
    }

    public void setParetCategory(Integer paretCategory) {
        this.paretCategory = paretCategory;
    }


    @Override
    public String toString() {
        return "Category{" +
                "idCategory=" + idCategory +
                ", nameCategory='" + nameCategory + '\'' +
                ", keyWords='" + keyWords + '\'' +
                ", paretCategory=" + paretCategory +
                '}';
    }
}


