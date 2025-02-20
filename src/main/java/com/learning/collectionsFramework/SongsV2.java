package com.learning.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public record SongsV2(String title,String artist) implements Comparable<SongsV2>{

//    private String title;
//    private String artist;
//
//    public SongsV2(
//          String title,
//          String artist
//    )
//    {
//        this.title = title;
//        this.artist = artist;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getArtist() {
//        return artist;
//    }

    @Override
    public String toString() {
        return "SongsV2{" +
              "title='" + title + '\'' +
              ", artist='" + artist + '\'' +
              '}';
    }

    @Override
    public int compareTo(SongsV2 o) {
        return title.compareTo(o.title());  // returns
    }
}

class MockSongs{
    public static List<SongsV2> getSongsV2(){
        List<SongsV2> songs = new ArrayList<>();
        songs.add(new SongsV2("a","zero 7"));
        songs.add(new SongsV2("b","zero 4"));
        songs.add(new SongsV2("z","zero 23"));
        songs.add(new SongsV2("r","zero 2"));
        songs.add(new SongsV2("d","zero 1"));
        return songs;
    }

}
