import java.util.*;
public class commonelements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        //common elements in arr1 and arr2
        HashSet <Integer> set1 = new HashSet<>();
        for(Integer i : arr1) {
            set1.add(i);
        }
        System.out.println(set1);
        HashSet <Integer> set2 = new HashSet<>();
    
        for(Integer j : arr2) {
         if (set1.contains(j)){
            set2.add(j);
         }
        }
        System.out.println(set2);
        
          
         
        


          
        
        
    }
    
}

//https://chatgpt.com/share/67c600c7-2248-8006-a5ab-e0621879fe4d