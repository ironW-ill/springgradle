package com.example.springgradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

        @GetMapping("/")
        public String index() {
                return "KBS KBS KBS";
        }

}