package com.learning.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class SongsV3 implements Comparable<SongsV3>{

    private String title;
    private String artist;

    public SongsV3(
          String title,
          String artist
    )
    {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "SongsV2{" +
              "title='" + title + '\'' +
              ", artist='" + artist + '\'' +
              '}';
    }

    @Override
    public int compareTo(SongsV3 o) {
        return title.compareTo(o.getTitle());
    }
}

class MockSongs1 {

    public static List<SongsV3> getSongsV3() {
        List<SongsV3> songs = new ArrayList<>();
        songs.add(new SongsV3("a", "zero 75"));
        songs.add(new SongsV3("c", "zero 44"));
        songs.add(new SongsV3("ze", "zero 23"));
        songs.add(new SongsV3("c", "zero 28"));
        songs.add(new SongsV3("t", "zero 1"));
        return songs;
    }
}


