package com.lucasjwilber.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongrController {

    @Autowired
    SongrRepository repo;


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

        Album album1 = new Album("NOW! 80s", "Multiple Artists", 100, 600, "NOW80s.jpg");
        Album album2 = new Album("Object object", "JavaScrap", 8, 555, "JS.png");
        Album album3 = new Album("Ratch City", "Roach Lord", 69, 420, "ratch.jpg");

        Album[] albums = new Album[]{album1, album2, album3};

        m.addAttribute("albums", albums);

        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum() {
        System.out.println("addAlbum() entered");
        repo.save(new Album());
        return new RedirectView("/albums");
    }
}
