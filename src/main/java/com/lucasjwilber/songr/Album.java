package com.lucasjwilber.songr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;

    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageURL;

    //default constructor for JPA
    public Album() {};

    public Album(String title, String artist, int songCount, int length, String imageURL) {

        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = "/images/" + imageURL;
    }
}
