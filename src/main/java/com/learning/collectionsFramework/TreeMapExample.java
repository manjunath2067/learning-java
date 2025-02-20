package com.learning.collectionsFramework;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ram",85);
        scores.put("Sham",57);
        scores.put("Bham",92);
        scores.putIfAbsent("sham",4);


        Map<String,Integer> scor = Map.of(
              "Bhalu",45,
              "kalu",34,
              "halu",58
        );

//        scor.put("jjj",33);

        System.out.println(scor);








//        System.out.println(scores);
//        System.out.println(scores.get("Ram"));
//        System.out.println(scores.containsKey("Sham"));
//        System.out.println(scores.containsValue(45));
//        System.out.println(scores.remove("Bham"));


        //convenience Factory methods
        List<String> stringList = List.of("Saum","cassed");
        List<SongsV4> objectList = List.of(new SongsV4("f","zero 4"));


        Set<Book> books = Set.of(new Book("frog"));


        // convert to collection
        Set<Map.Entry<String,Integer>> entries = scores.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+","+entry.getValue());
        }

//        System.out.println(scores.keySet());

        // linked hashmap all are with same methods just order is maintained


        //
        NavigableMap<Integer,String> tmap = new TreeMap<>();   // b - a
        tmap.put(1,"aj");
        tmap.put(2,"gj");
        tmap.put(3,"kj");

        Set<Map.Entry<Integer,String>> set = tmap.entrySet();
        for (Map.Entry<Integer, String> tg : set) {
            System.out.println(tg.getKey()+","+tg.getValue());
        }

        System.out.println(tmap.ceilingKey(0));    // grater than or equal to
        System.out.println(tmap.ceilingEntry(2));

        System.out.println(tmap.pollFirstEntry());






        Integer ar[] = new Integer[] {1,2,53,1245,12,452,2,34,35,2,3,4,24,5,2,21};
        Arrays.sort(ar);
        List<Integer> lt = Arrays.asList(ar);
        System.out.println(lt);

//        Collections.sort(lt,Collections.reverseOrder());

        System.out.println(Collections.binarySearch(lt,100));


        // HashMap and HashTable -> unordered
        //LinkedHashMap -> ordered











    }

}
