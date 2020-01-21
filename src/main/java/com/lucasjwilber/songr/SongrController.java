package com.lucasjwilber.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SongrController {

    @GetMapping("/")
    public String splashPage() {
        return "splashPage";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "helloWorld";
    }

    @GetMapping("/capitalize/{words}")
    public String capitalize(Model m, @PathVariable String words) {
        m.addAttribute("words", words.toUpperCase());
        return "capitalize";
    }

    @GetMapping("/albums")
    public String albums(Model m) {

        Album album1 = new Album("Ratch City", "roach lord", 69, 420, "images/ratch.jpg");
        Album album2 = new Album("Ratch City", "roach lord", 69, 420, "images/ratch.jpg");
        Album album3 = new Album("Ratch City", "roach lord", 69, 420, "images/ratch.jpg");

        Album[] albums = new Album[]{album1, album2, album3};

        m.addAttribute("albums", albums);

        return "albums";
    }
}
