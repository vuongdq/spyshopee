
package com.example.spyecom.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/web")
public class HelloController {
    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }
}
