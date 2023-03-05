package Javacollection.HashSet;

import java.util.*;

public class hash2 {

    public static void main(String[] args) {
        String st = "abcdefghiavb";
        firstrepeatingchar(st);

    }

    public static void firstrepeatingchar(String st) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (set.contains(ch)) {
                System.out.println(ch);
                return;
            } else {
                set.add(ch);
            }
        }
        System.out.println(-1);
    }

}
