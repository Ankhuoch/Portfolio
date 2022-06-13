package edu.itc.i4gic.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class loginController {
    @GetMapping("/tp14/login")
    public String index(Model model, @RequestParam(name = "msg", defaultValue = "") String msg) {
        model.addAttribute("msg", msg);
        return "login";
    }
}
