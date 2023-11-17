package com.springmvc.response;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/response/rest")
public class ResponseRestController {
    // [Response header]
    //   Content-Type: text/html
    // [Response body]
    //   {"name":"YoonSeongHo","age":95}
    @GetMapping("/json/string")
    public String helloStringJson() {
        return "{\"name\":\"YoonSeongHo\",\"age\":95}";
    }

    // [Response header]
    //   Content-Type: application/json
    // [Response body]
    //   {"name":"YoonSeongHo","age":95}
    @GetMapping("/json/class")
    public Star helloClassJson() {
        return new Star("YoonSeongHo", 95);
    }
}