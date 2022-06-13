package edu.itc.i4gic.library;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Home_Controller {
    @PostMapping("/tp14/homepage")
    public ModelAndView index(Model model, HttpServletRequest request) {
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        ModelAndView mav = null;
        if ("toto".equalsIgnoreCase(username) &&
                "titi".equals(pwd)) {
            mav = new ModelAndView("home");
            mav.addObject("username", username);
        } else {
            mav = new ModelAndView("redirect:/tp14/login");
            mav.addObject("msg", "Invalid username or password.");
        }
        return mav;
    }
}
