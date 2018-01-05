package com.sandbox;

        import org.springframework.web.bind.annotation.RestController;
        import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping("/alpha")
    public String index() {
        return "Greetings from Alpah Service";
    }
}