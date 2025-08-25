import java.util.*;
public class hashmapintersaction {
    public static void main(String[] args) {

        // Create a HashMap
        int [] arr1 = {1, 2, 3, 4, 5};
        int [] arr2 = {4, 5 , 6,7,8,9};
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for(int i :arr1){
            map1.put(i , map1.getOrDefault(i, null)+1);
        }
        for(int i :arr2){
            map2.put(i , map2.getOrDefault(i, null)+1);
        }
        
        // Find the intersection of the two maps
        for (int i : map1.keySet()) {
            if (map2.containsKey(i) && map1.get(i) == map2.get(i));
        }
    }
    
}
