package com.detroitlabs.giflibrary.data;

import com.detroitlabs.giflibrary.model.Gif;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("toobad", LocalDate.of(2019,2, 23),
                    "Erika Languirand", true, 2),
            new Gif("exhausting", LocalDate.of(2019,2, 23),
                    "Jen Bloomer", true, 2),
            new Gif("headtilt", LocalDate.of(2019,2, 23),
                    "Dan Newport", true, 1),
            new Gif("corgibeg", LocalDate.of(2019,2, 23),
                    "Matt of Lansing", true, 1),
            new Gif("hugemistake", LocalDate.of(2019,2, 23),
                    "Erika Languirand", true, 2),
            new Gif("whatisaid", LocalDate.of(2019,2, 23),
                    "Dan Newport", true, 3));

  /*
        @RequestMapping("/")
        @ResponseBody

   */
        public Gif findByName(String name){
            for(Gif gif: ALL_GIFS){
                if(gif.getName().equals(name)){
                    return gif;
                }
            }
            return  null;
        }//end findByName

    public List<Gif> findByID(int id){
            List<Gif> gifsByCategory = new ArrayList<>();
        for(Gif gif: ALL_GIFS){
            if(gif.getId() == id){
                gifsByCategory.add(gif);

            }//end if
        }//end for
        return gifsByCategory;
    }//end findByID

}//end class GifRepository
