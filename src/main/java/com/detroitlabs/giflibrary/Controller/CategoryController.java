package com.detroitlabs.giflibrary.Controller;
import com.detroitlabs.giflibrary.data.CategoryRepository;
import com.detroitlabs.giflibrary.data.GifRepository;
import com.detroitlabs.giflibrary.model.Category;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller

public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private GifRepository gifRepository;
    @RequestMapping("/categories")
    //@RequestMapping
    //@ResponseBody

    public String displayCategories(ModelMap modelMap){
        modelMap.put("categories", categoryRepository.getAllCategories());

        return "categories";
    }//end sayHello method

    @RequestMapping("/category/{id}")
    //@ResponseBody

    public String categoryGifs(@PathVariable int id, ModelMap modelMap){

        Category category = categoryRepository.findByID(id);
        modelMap.put("category", category);
        List<Gif> gifByCategory = gifRepository.findByID(id);
        modelMap.put("gifByCategory", gifByCategory);
        return "category";
    }//end gifDetails method


}
