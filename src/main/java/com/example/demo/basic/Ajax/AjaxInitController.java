package com.example.demo.basic.Ajax;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AjaxInitController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
