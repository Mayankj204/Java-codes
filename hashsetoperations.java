import java.util.*;
public class hashsetoperations {
    public static void main(String[] args) {
        HashSet<Integer> set1= new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        System.out.println("HashSet 1: "+set1);
        HashSet <Integer> set2= new HashSet<>();
        set2.add(40);
        set2.add(50);
        set2.add(60);
        set2.add(70);
        set2.add(80);
        System.out.println("HashSet 2: "+set2);
        HashSet <Integer> union= new HashSet<>();
        // Union of two sets
     set1.addAll(set2);
     System.out.println("Union of set1 and set2: "+ set1);
     // Intersection of two sets
     set1.retainAll(set2);
     System.out.println("Intersection of set1 and set2: "+ set1);
     // Difference of two sets
     set1.removeAll(set2);
     System.out.println("Difference of set1 and set2: "+ set1);


    }
    
}
