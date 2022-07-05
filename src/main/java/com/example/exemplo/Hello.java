package com.example.exemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class Hello {

    @GetMapping(value = "/")
    public String getMethodName() {
        return "Olá pessoal!";
    }

}
