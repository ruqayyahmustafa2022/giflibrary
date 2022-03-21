package com.detroitlabs.giflibrary.Controller;

import com.detroitlabs.giflibrary.data.GifRepository;
import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;
    @RequestMapping("/")
    //@RequestMapping
    //@ResponseBody

    public String displayGifs(){
        return "home";
    }//end sayHello method

    @RequestMapping("/gif/{name}")
    //@ResponseBody

    public String gifDetails(@PathVariable String name, ModelMap modelMap){
        /*Gif gif = new Gif("corgibeg",
                           LocalDate.of(2019, 2, 25),
                           "Erika Languirand", true); */
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }//end gifDetails method



}//end GifController
