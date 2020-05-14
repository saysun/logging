package com.example.testloggin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/t")
    public String getTest(){
        return "Singapore Hello world!!! WHat";
    }


    @GetMapping("/y")
    public String getTesty(@RequestParam String date, @RequestParam int num){
        return "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
    }

    @GetMapping("/gitpoding")
    public String gitpod(){
        return "Git pod is really a awesome tool. This is a game changer!!!!";
    }
}
