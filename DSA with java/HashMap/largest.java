//Find the Largest element in an array

import java.util.*;

public class largest {

    public static void main(String[] args) {
    
    
    int arr1[] = {2,5,1,3,0};
    System.out.println("the largest number is " + sort(arr1));

    int arr2[] = {8,10,5,7,9};
    System.out.println("the largest number is " + sort(arr2));
    }
   static int sort(int arr[])
   {
    Arrays.sort(arr);
    return arr[arr.length-1];
   }

        
    }
    
