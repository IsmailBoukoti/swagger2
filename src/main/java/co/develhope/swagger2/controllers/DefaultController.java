package co.develhope.swagger2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class helloMessage {
        @GetMapping("/")
        public String sayWelcome() {
                return "Welcome!";
        }
}