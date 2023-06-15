package org.example;

import org.model.RandomAndJokes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchDataController {
    @PostMapping("postData")
    public String postData(){
        return "post method";
    }
    @GetMapping("getData")
    public RandomAndJokes getData(@RequestBody RandomAndJokes randomAndJokes){
//        System.out.println(randomAndJokes.toString());
        return randomAndJokes;
    }

}
