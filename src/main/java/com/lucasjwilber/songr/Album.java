package com.lucasjwilber.songr;

public class Album {
    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String imageURL;

    public Album(String title, String artist, int songCount, int length, String imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageURL = imageURL;
    }
}
