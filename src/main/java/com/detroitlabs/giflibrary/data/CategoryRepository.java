package com.detroitlabs.giflibrary.data;

import java.util.Arrays;
import java.util.List;

import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;

import static com.detroitlabs.giflibrary.data.GifRepository.ALL_GIFS;
@Component
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Animals"),
            new Category(2, "Celebrities"),
            new Category(3, "Reality Star"));


    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }//end getAllCategories


    public Category findByID(int id){
        for(Category category: ALL_CATEGORIES){

            if(category.getId()==id){
                return  category;
            }
        }
        return  null;
    }//end findByID

}//end Category Repository
