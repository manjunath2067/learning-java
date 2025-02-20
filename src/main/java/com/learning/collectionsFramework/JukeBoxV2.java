package com.learning.collectionsFramework;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Sorting using only comparators
 */
public class JukeBoxV2 {

    public static void main(String[] args) {
        new JukeBoxV2().go();
    }

    public void go() {

        List<SongsV3> songsV3List = MockSongs1.getSongsV3();
        System.out.println(songsV3List);

        ArtistCompare artistCompare = new ArtistCompare();
        songsV3List.sort(artistCompare);
        System.out.println(songsV3List);

        TitleCompare titleCompare = new TitleCompare();
        songsV3List.sort(titleCompare);
        System.out.println(songsV3List);

        // either we can do by using lambda
//        songsV3List.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
//        System.out.println(songsV3List);


    }

    static class ArtistCompare implements Comparator<SongsV3>{
        public int compare(SongsV3 one, SongsV3 two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }
//
    static class TitleCompare implements Comparator<SongsV3>{
        public int compare(SongsV3 one, SongsV3 two){
            return one.getTitle().compareTo(two.getTitle());
        }
    }
}
