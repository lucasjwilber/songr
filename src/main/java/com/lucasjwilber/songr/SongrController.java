package com.lucasjwilber.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SongrController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "helloWorld";
    }

    @GetMapping("/capitalize/{words}")
    public String capitalize(Model m, @PathVariable String words) {
        m.addAttribute("words", words.toUpperCase());
        return "capitalize";
    }
}
