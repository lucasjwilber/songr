package com.lucasjwilber.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;


@Controller
public class SongrController {

    @Autowired
    AlbumRepository albumRepo;

    @Autowired
    SongRepository songRepo;

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
        List<Album> albums = albumRepo.findAll();
        m.addAttribute("albums", albums);
        return "albums";
    }

    @PostMapping("/albums")
    public RedirectView addAlbum(Album newAlbum) {
        albumRepo.save(newAlbum);
        return new RedirectView("/albums");
    }

    @DeleteMapping("/albums/{albumId}")
    public RedirectView deleteAlbum(@PathVariable Long albumId) {
        albumRepo.deleteById(albumId);
        return new RedirectView("/");
    }

    @GetMapping("/songs")
    public String getAllSongs(Model m, Song song) {
        List<Song> songs = songRepo.findAll();
        m.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/album/{id}")
    public String viewAlbum(@PathVariable Long id, Model m) {
        Album album = albumRepo.getOne(id);

        m.addAttribute("album", album);
        return "album";
    }

    @PostMapping("/addSong/{id}")
    public RedirectView addSong(@PathVariable("id") Long id, Song newSong) {
        newSong.album = albumRepo.getOne(id);
        songRepo.save(newSong);

        return new RedirectView("/albums");
    }

}
