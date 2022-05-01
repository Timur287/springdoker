package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class MyRestService {
private CatRepository catRepository;
    @GetMapping
    public String helloWorld(){
        return " hello world";
    }
//        http://localhost:8080/cats
    @GetMapping("/cats")
    public List<Cat> getAll(){
        return catRepository.findAll();
    }

    @PostMapping("/cats")
//    {
//        "id": 1,
//            "name": "hello",
//            "age": 10
//    }
    public Cat saveCat(@RequestBody Cat cat){
        return catRepository.save(cat);
    }

}
