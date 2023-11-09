package com.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/html")
public class htmlController {

    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello() {
        return "hello.html";
    }

    @GetMapping("/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    @GetMapping("/templates")
    public String htmlTemplates() {
        return "hello";
    }

    @GetMapping("/dynamic")
    public String htmlDynamic(Model model) {
        visitCount ++;
        model.addAttribute("visits", visitCount);

        return "hello-visit";
    }
}