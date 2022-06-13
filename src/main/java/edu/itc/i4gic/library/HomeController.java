package edu.itc.i4gic.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "Hello world";
    }

    @GetMapping("/tp14/task1")
    public String task1() {
        return "<h1>Welcome to TP14 Task1</h1>";
    }
}