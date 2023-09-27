package atu.cicd2.lab1_helloworldspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}
