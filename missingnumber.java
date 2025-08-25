import java.util.*;
// You are given an array containing n - 1 numbers from the range [1, n], meaning one number is missing. 
//Find the missing number efficiently.

// Example 1

// Input: arr = {1, 2, 4, 5}, n = 5
// Output: 3
public class missingnumber {
   

    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 5 };
        int n = 5;
        int actualsum=0;
        int expectedsum=0;
        for (int i = 1; i <= n; i++) {
            expectedsum+=i;
        }
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : a1)
        {
           actualsum+=i;
           set.add(i);
        }
 System.out.println(expectedsum-actualsum);
    }
}
