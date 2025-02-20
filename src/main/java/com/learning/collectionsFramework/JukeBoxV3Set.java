package com.learning.collectionsFramework;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JukeBoxV3Set {

    public static void main(String[] args) {
        new JukeBoxV3Set().go();
    }
    public void go(){
        List<SongsV3> songsV3List = MockSongs1.getSongsV3();
        System.out.println(songsV3List);

        songsV3List.sort((a,b) -> a.getTitle().compareTo(b.getTitle()));
        System.out.println(songsV3List);

        Set<SongsV3> songsV3Set = new HashSet<>(songsV3List);
        System.out.println(songsV3Set);

    }

}
