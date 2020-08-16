package com.moshe.game.dictionry.contrroler;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
public class DictionaryController {
    
 
    @GetMapping("/getWords")
    public List<String> homePage() {
        return Arrays.asList("moshe","benita","orli");
    }
    
    @GetMapping("/tmp")
    public String homePage1() {
        return "tmp";
    }
    
   
}

