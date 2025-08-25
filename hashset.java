import java.util.*;
public class hashset {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1); // duplicate element, will be ignored
        set.add(5);
        set.add(6);

        System.out.println(set);
        set.remove(3);  // remove an element
        System.out.println(set);
       System.out.println(set.contains(4));
     
       //iteration using for-each loop
       for (Integer i : set) {
        if(i>3){
        System.out.println(i);
        }
       }
  // iteration using iterator
  Iterator<Integer> it = set.iterator();
  while (it.hasNext()) {
    Integer i = it.next();
    if(i<3){
    System.out.println(i);
    }
  }

  
    

    }
}