import java.util.*;
public class twoarrayhavesamefrequencyornot {
//same frequency 
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 1, 4 };
        int[] arr2 = { 1, 2, 3, 4, 1,4 };
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
        }
        System.out.println(map1);
        for (int i = 0; i < arr2.length; i++) {
            map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        }
        System.out.println(map2);
        if (map1.equals(map2)) {
            System.out.println("Both arrays have same frequency");
        } else {
            System.out.println("Both arrays do not have same frequency");
        }
       
    }
}