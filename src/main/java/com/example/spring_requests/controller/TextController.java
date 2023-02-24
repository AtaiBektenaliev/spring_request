package com.example.spring_requests.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class TextController {

    @GetMapping("/text")
    String getText(){return "Hello world";}

    @PostMapping("/text/update/{text}")
    String updateText(@PathVariable String text){return "Hello " + text;}


}
