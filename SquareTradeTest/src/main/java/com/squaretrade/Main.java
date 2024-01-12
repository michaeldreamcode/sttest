package com.squaretrade;

import com.squaretrade.business.CategoryBO;
import com.squaretrade.model.Category;
import com.squaretrade.util.UtilST;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CategoryBO  categoryBO = new CategoryBO();
        List<Category> listCategory = UtilST.buildListCategory();



        Category lawn = new Category(3,"Lawn", "lawn,tools",1);
        Category catwhitoutKW = new Category(4,"Lawn", "",3);
        System.out.println("size List "+listCategory.size());
        //print level of category
        System.out.println("Level Category: "+ categoryBO.getLvlCategory(lawn,listCategory));
        //call the method to get categories by keyword
        List<Category> list = categoryBO.getCategoryByKeyWord("lawn",listCategory);
        System.out.println("found category: "+ list.size());
        for(Category cat : list){
            System.out.println("Category->"+cat.toString());
        }

        //print the keyword by category
        System.out.println("found KeyWord: "+categoryBO.getKeyWordByCategory(catwhitoutKW,listCategory));

    }
}