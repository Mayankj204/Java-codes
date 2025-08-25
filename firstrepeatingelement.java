import java.util.*;
public class firstrepeatingelement {
    public static void main(String[] args) {
  int [] arr ={1,2,3,2,4,5,6,4,7,5};

HashSet<Integer> set = new HashSet<>();
for(Integer i : arr) {
  if(set.contains(i)){
  System.out.println("elemet is "+i);
  break;
  }
  else{
    set.add(i);
  }
}

    }
    
}
