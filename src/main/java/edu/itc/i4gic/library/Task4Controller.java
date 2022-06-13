package edu.itc.i4gic.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Task4Controller {
    @GetMapping("/tp14/task4")
    public String index() {
        return "task4";
    }
}
