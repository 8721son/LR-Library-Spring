package kr.co.lrlibrary.module.web;

import lombok.Getter;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    public String index(Model model){

        model.addAttribute("a",1);
        return "index";
    }
}
