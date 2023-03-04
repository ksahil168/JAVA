package JavaHashMap;

import java.util.*;

public class Hash {

    public static void main(String[] args) {
        HashMap<String, Integer> population = new HashMap<>();

        // add
        population.put("India", 138);
        population.put("pakistan", 123);
        population.put("Nepal", 34);
        population.put("USA", 35);
        population.put("SrLanka", 78);

        /*
         * get
         * System.out.println(population.get("India"));
         * System.out.println(population.get("USA"));
         */
        /*
         * to check whether key valus is present or not
         * System.out.println(population.containsKey("India"));
         * System.out.println(population.containsKey("India"));
         */
        // traversing on keys
        // for(String s: population.keySet()){
        // System.out.println(s);

        // Size of Hashmap
        System.out.println(population.size());

        // remove from hashmap
        population.remove("India");
        System.out.println(population.containsKey("India"));
        System.out.println(population.size());
    }

}
