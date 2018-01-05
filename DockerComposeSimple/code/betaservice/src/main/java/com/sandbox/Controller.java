package com.sandbox;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/beta")
    public String index() {
        return "Greetings from Beta Service";
    }
}
