package Javacollection;

import java.util.*;

public class get_common_element {
    public static void main(String[] args) {
        int[] arr1 = {5,8,9,6,3,2,10};
        int[] arr2 = {9,7,1,5,2,14,20};

        get_common_element(arr1,arr2);
    }

    public static void get_common_element(int[]arr1, int[]arr2){
     HashMap<Integer,Integer> map  = new HashMap<>();
     
     for(int i =0; i < arr1.length;i++){
        map.put(arr1[i], 1);
     }

     for(int i =0; i < arr2.length;i++){
       if(map.containsKey(arr2[i])){
        System.out.println(arr2[i]);;
       }

    }
    }

}

