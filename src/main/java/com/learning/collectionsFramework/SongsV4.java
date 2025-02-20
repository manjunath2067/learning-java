package com.learning.collectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class SongsV4 implements Comparable<SongsV4>{

    private String title;
    private String artist;

    public SongsV4(
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
        return "SongsV4{" +
              "title='" + title + '\'' +
              ", artist='" + artist + '\'' +
              '}';
    }

    @Override
    public int compareTo(SongsV4 o) {
        return title.compareTo(o.getTitle());
    }

    @Override
    public boolean equals(Object obj) {
        SongsV4 other = (SongsV4) obj;
        return title.equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }


}
class MockSongsV4 {

    public static List<SongsV4> getSongsV4() {
        List<SongsV4> songs = new ArrayList<>();
        songs.add(new SongsV4("a", "zero 7"));
        songs.add(new SongsV4("c", "zero 4"));
        songs.add(new SongsV4("ze", "zero 23"));
        songs.add(new SongsV4("c", "zero 2"));
        songs.add(new SongsV4("t", "zero 1"));
        return songs;
    }
}
