import java.util.*;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        twoSum(nums, target);
    }

    public static void twoSum(int[] nums, int target) {
   Set<Integer> set=new HashSet<>();
   
    for(int i:nums){
        set.add(i);
         if(set.contains(target-i)){
            System.out.println(i+" "+(target-i));
            break;
         }
       
    }   

    }
}
