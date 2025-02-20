package com.learning.collectionsFramework;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JukeBoxTreeSet {

    public static void main(String[] args) {
        new JukeBoxTreeSet().go();

    }

    public void go(){
        List<SongsV4> songsV4List = MockSongsV4.getSongsV4();
        System.out.println(songsV4List);

        songsV4List.sort((a,b) -> a.getTitle().compareTo(b.getTitle()));
        System.out.println(songsV4List);

        Set<SongsV4> songsV4Set = new TreeSet<>(songsV4List);
        System.out.println(songsV4Set);
    }

}
