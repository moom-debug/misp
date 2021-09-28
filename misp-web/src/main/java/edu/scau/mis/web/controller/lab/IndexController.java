package edu.scau.mis.web.controller.lab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lab")
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "Hello SpringBoot";
    }

}
