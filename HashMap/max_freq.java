package JavaHashMap;

import java.util.*;

public class max_freq {
  public static void main(String[] args) {
    String st = "abababhgsbactgachab";
    max_freq(st);
  }

  public static void max_freq(String st) {
    HashMap<Character, Integer> fmap = new HashMap<>();

    for (int i = 0; i < st.length(); i++) {
      char ch = st.charAt(i);

      if (fmap.containsKey(ch) == true) {
        int c_freq = fmap.get(ch);
        fmap.put(ch, c_freq + 1);
      } else {
        fmap.put(ch,1);
      }
    }

    int maxval = 0;
    char maxchar = 'a';

    for (char c : fmap.keySet()) {
      if (fmap.get(c) > maxval) {
        maxval = fmap.get(c);
        maxchar = c;
      }
    }

    System.out.println(maxchar);

  }
}
