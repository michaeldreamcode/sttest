package com.squaretrade.util;

import com.squaretrade.model.Category;
import com.squaretrade.model.CategoryBuilder;

import java.util.ArrayList;
import java.util.List;

public class UtilST {

    public static List<Category> buildListCategory(){

        Category root = new Category(0,"root","product",null);

        Category furniture = new Category(1,"Furniture","Furniture,garden",0);
        Category garden = new Category(2,"Furniture","Furniture,garden",1);
        Category lawn = new Category(3,"Lawn", "lawn,tools",1);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(root);
        categoryList.add(furniture);
        categoryList.add(garden);
        categoryList.add(lawn);


        return categoryList;
    }
}
