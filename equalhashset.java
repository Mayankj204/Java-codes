import java.util.*;
public class equalhashset {
    public static void main(String[] args) {
    HashSet <Integer> set1=new HashSet<>();
    HashSet<Integer> set2=new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);
    set1.add(50);
    set2.add(10);
    set2.add(20);
    set2.add(30);
    set2.add(40);
    set2.add(50);
    System.out.println("HashSet 1: "+set1);
    System.out.println("HashSet 2: "+set2);
    if(set1.equals(set2)){
        System.out.println("HashSet 1 is equal to HashSet 2");
    }
    else{
        System.out.println("HashSet 1 is not equal to HashSet 2");
    }
}
}
