package com.learning.collectionsFramework;

import java.util.Collections;
import java.util.List;

/**
 * Sorting using with comparable
 */

public class JukeBox {

    public static void main(String[] args) {
        new JukeBox().go();

    }

    public void go(){
        List<SongsV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);
    }

}
