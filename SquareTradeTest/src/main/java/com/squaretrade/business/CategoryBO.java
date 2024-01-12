package com.squaretrade.business;

import com.squaretrade.model.Category;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CategoryBO {


    /**
     * this method find a list of category by keyword
     * @param keyWord
     * @param listCatgory
     * @return
     */
    public List<Category> getCategoryByKeyWord(String keyWord , List<Category> listCatgory){
        List<Category> categoryList= listCatgory.stream().filter(cat->cat.getKeyWords()
                .contains(keyWord)).collect(Collectors.toList());
        return categoryList;
    }



    Integer count = 0;

    /**
     * this method get the level of the category
     * @param category
     * @param listCatgory
     * @return
     */
    public Integer getLvlCategory(Category category, List<Category> listCatgory){

        Optional<Category> catf= listCatgory.stream().filter(cat->cat.getIdCategory()
                .equals(category.getParetCategory())).findFirst();

        if(catf.isPresent()){
            count ++;
            getLvlCategory(catf.get(),listCatgory);
        }

        return count;
    }


    String keywords="";

    /**
     * this method find keyword by category
     * @param category
     * @param listCatgory
     * @return
     */
    public String getKeyWordByCategory (Category category , List<Category> listCatgory){

        if(category.getKeyWords()==null || category.getKeyWords().isEmpty()){
            Optional<Category> catf= listCatgory.stream().filter(cat->cat.getIdCategory()
                    .equals(category.getParetCategory())).findFirst();
            getKeyWordByCategory(catf.get(),listCatgory);
        }
        keywords=keywords+category.getKeyWords();
        return keywords;

    }


}
