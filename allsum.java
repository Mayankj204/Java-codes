import java.util.*;

public class allsum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 8, 5, 5 };
        int sum = 10;
        System.out.println("hello");
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : arr) {
            if (set.contains(sum-i)) {
                System.out.println("Pair found " + i + " " + (sum-i));
            }else {
                set.add(i);
            }
        }
    }
}
