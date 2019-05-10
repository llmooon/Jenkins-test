package com.naver.pay;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test2")
public class testController {
    @GetMapping
    public String test(){
        return "hello2";
    }
}
