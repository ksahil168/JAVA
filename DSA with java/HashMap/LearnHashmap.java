package HashMap;

// Java HashMap
// It stores elements in key/value pairs. Here, keys are unique identifiers used
// to associate each value on a map.

// Create a HashMap

/*
 * In order to create a hash map,
 * we must import the java.util.HashMap package first. Once we import the
 * package, here is how we can create hashmaps in Java.
 */

// HashMap<K, V> numbers = new HashMap<>(); <--------------

/*
 * In the above code, we have created a hashmap named numbers.
 * Here, K represents the key type and V represents the type of values. For
 * example,
 */

// HashMap<String, Integer> numbers = new HashMap<>(); <--------------

// Example 1: Create HashMap in Java

import java.util.HashMap;
import java.util.Map.Entry;

class LearnHashmap {
    public static void main(String[] args) {
        // create hashmap
        HashMap<Integer, String> languages = new HashMap<>();

        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(3, "JavaScript");
        System.out.println("Hasmap : " + languages);

        String value = languages.get(2);
        System.out.println("Hasmap : " + value);

        // return set view of keys
        // using keySet()
        System.out.println("keys : " + languages.keySet());

        // return set view of values
        // using values()
        System.out.println("keys : " + languages.values());

        // return set view of key/value pairs
        // using entrySet()
        System.out.println("keys : " + languages.entrySet());

        // change element with key 2
        languages.replace(2, "C++");
        System.out.println("Hasmap : " + languages);

        // remove element associated with key 2
        languages.remove(2);
        System.out.println("Hasmap : " + languages);

        // Iterate through keys only
        System.out.print("keys: ");
        for (Integer key : languages.keySet()) {
            System.out.print(key);
            System.out.print(", ");

        }

        // iterate through values only
        System.out.print("\nValues: ");
        for (String v : languages.values()) {
            System.out.print(v);
            System.out.print(", ");
        }
        // iterate through key/value entries
        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : languages.entrySet()) {
            System.out.print(entry);
            System.out.print(", ");
        }
    }
}

// -----------------------------------------------------------------------------------------//
/*
 * Basic Operations on Java HashMap
 * The HashMap class provides various methods to perform different operations on
 * hashmaps.
 * We will look at some commonly used arraylist operations in this tutorial:
 * 
 * Add elements
 * 1. Access elements
 * 2. Change elements
 * 3. Remove elements
 */
// -------------------------------------------------------------------------------------------------//
/*
 * 1. Add elements to a HashMap
 * ---------------------------------------
 * To add a single element to the hashmap, we use the put() method of the
 * HashMap class. For example
 * import java.util.HashMap;
 * 
 * class Main {
 * public static void main(String[] args) {
 * 
 * // create a hashmap
 * HashMap<String, Integer> numbers = new HashMap<>();
 * 
 * System.out.println("Initial HashMap: " + numbers);
 * // put() method to add elements
 * numbers.put("One", 1);
 * numbers.put("Two", 2);
 * numbers.put("Three", 3);
 * System.out.println("HashMap after put(): " + numbers);
 * }
 * }
 * 
 * Here, we are passing the String value One as the key and Integer value 1 as
 * the value to the put() method.
 */
// --------------------------------------------------------------------------------------------------------------//

/*
 * 2. Access HashMap Elements
 * --------------------------------
 * We can use the get() method to access the value from the hashmap. For
 * example,
 * 
 * 
 * class LearnHashmap {
 * public static void main(String[] args) {
 * // create hashmap
 * HashMap<Integer, String> languages = new HashMap<>();
 * 
 * languages.put(1, "Java");
 * languages.put(2, "Python");
 * languages.put(3, "JavaScript");
 * 
 * String value = languages.get(2);
 * System.out.println("Hasmap : " + value);
 * 
 * }
 * }
 * 
 */
// ------------------------------------------------------------------------------------------------------//
/*
 * We can also access the keys, values,
 * and key/value pairs of the hashmap as set views using keySet(), values(), and
 * entrySet() methods respectively. For example
 * 
 * import java.util.HashMap;
 * 
 * class Main {
 * public static void main(String[] args) {
 * HashMap<Integer, String> languages = new HashMap<>();
 * 
 * languages.put(1, "Java");
 * languages.put(2, "Python");
 * languages.put(3, "JavaScript");
 * System.out.println("HashMap: " + languages);
 * 
 * // return set view of keys
 * // using keySet()
 * System.out.println("Keys: " + languages.keySet());
 * 
 * // return set view of values
 * // using values()
 * System.out.println("Values: " + languages.values());
 * 
 * // return set view of key/value pairs
 * // using entrySet()
 * System.out.println("Key/Value mappings: " + languages.entrySet());
 * }
 * }
 * 
 */

// -----------------------------------------------------------------------------------------//

/*
 * 3. Change HashMap Value
 * -----------------------------------
 * We can use the replace() method to change the value associated with a key in
 * a hashmap. For example,
 * 
 * 
 * 
 * class LearnHashmap {
 * public static void main(String[] args) {
 * // create hashmap
 * HashMap<Integer, String> languages = new HashMap<>();
 * 
 * languages.put(1, "Java");
 * languages.put(2, "Python");
 * languages.put(3, "JavaScript");
 * System.out.println("Hasmap : " + languages);
 * 
 * // change element with key 2
 * languages.replace(2, "C++");
 * System.out.println("Hasmap : " + languages);
 * 
 * }
 * }
 */

// ------------------------------------------------------------------------------------////

/*
 * 4. Remove HashMap Elements
 * -------------------------------
 * To remove elements from a hashmap, we can use the remove() method. For
 * example,
 * 
 * // remove element associated with key 2
 * String value = languages.remove(2);
 * 
 */

// --------------------------------------------------------------------------------------//

/*
 * Other Methods of HashMap
 * Method Description
 * clear() ---- removes all mappings from the HashMap
 * compute() ---- computes a new value for the specified key
 * computeIfAbsent() ---- computes value if a mapping for the key is not present
 * computeIfPresent() ---- computes a value for mapping if the key is present
 * merge() ---- merges the specified mapping to the HashMap
 * clone() ---- makes the copy of the HashMap
 * containsKey() ---- checks if the specified key is present in Hashmap
 * containsValue() ---- checks if Hashmap contains the specified value
 * size() ---- returns the number of items in HashMap
 * isEmpty() ---- checks if the Hashmap is empty
 */

// ------------------------------------------------------------------------------------//

/*
 * Iterate through a HashMap
 * To iterate through each entry of the hashmap,
 * we can use Java for-each loop. We can iterate through keys only, vales only,
 * and key/value mapping. For example,
 * 
 * import java.util.HashMap;
 * import java.util.Map.Entry;
 * 
 * class Main {
 * public static void main(String[] args) {
 * 
 * // create a HashMap
 * HashMap<Integer, String> languages = new HashMap<>();
 * languages.put(1, "Java");
 * languages.put(2, "Python");
 * languages.put(3, "JavaScript");
 * System.out.println("HashMap: " + languages);
 * 
 * // iterate through keys only
 * System.out.print("Keys: ");
 * for (Integer key : languages.keySet()) {
 * System.out.print(key);
 * System.out.print(", ");
 * }
 * 
 * // iterate through values only
 * System.out.print("\nValues: ");
 * for (String value : languages.values()) {
 * System.out.print(value);
 * System.out.print(", ");
 * }
 * 
 * // iterate through key/value entries
 * System.out.print("\nEntries: ");
 * for (Entry<Integer, String> entry : languages.entrySet()) {
 * System.out.print(entry);
 * System.out.print(", ");
 * }
 * }
 * }
 * 
 */

// -------------------------------------------------------------------//
/*
 * import java.util.HashMap;
 * import java.util.TreeMap;
 * 
 * class LearnHashmap {
 * public static void main(String[] args) {
 * 
 * // create a treemap
 * TreeMap<String, Integer> evenNumbers = new TreeMap<>();
 * evenNumbers.put("Two", 2);
 * evenNumbers.put("Four", 4);
 * System.out.println("TreeMap: " + evenNumbers);
 * 
 * // create hashmap from the treemap
 * HashMap<String, Integer> numbers = new HashMap<>(evenNumbers);
 * numbers.put("Three", 3);
 * 
 * numbers.put("Five", 5);
 * System.out.println("HashMap: " + numbers);
 * }
 * }
 */
// -------------------------------------------------------------------------------------------------------//
/*
 * Note: While creating a hashmap, we can include optional parameters: capacity
 * and load factor. For example,
 * 
 * -- HashMap<K, V> numbers = new HashMap<>(8, 0.6f);
 * 
 * Here,
 * 8 (capacity is 8) - This means it can store 8 entries.
 * 0.6f (load factor is 0.6) - This means whenever our hash table is filled by
 * 60%,the entries are moved to a new hash table double the size of the original
 * hash table.
 * 
 * If the optional parameters not used, then the default capacity will be 16 and
 * the default load factor will be 0.75.
 */
