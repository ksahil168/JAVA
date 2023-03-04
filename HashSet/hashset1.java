package Javacollection.HashSet;

import java.util.*;

public class hashset1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        // check whether number is present or not
        System.out.println(set.contains(10));
        System.out.println(set.contains(70));

        // remove
        set.remove(10);
        System.out.println(set.contains(10));

        // size
        System.out.println(set.size());
    }
}
