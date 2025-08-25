import java.util.*;
public class removeduplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5,5};

    HashSet<Integer> set = new HashSet<>();
    for (int i : arr) {
        set.add(i);

    }
    System.out.println(set);
   

}
}

