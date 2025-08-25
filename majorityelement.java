import java.util.*;

public class majorityelement {
    public static void main(String[] args) {

        int[] nums = { 1,6 ,1,1,11,1,1,1,3,3,1,2,2,3,3,3,2,3,3,3,3,1,1,1,1,1,1 };
        int n = nums.length / 8;
        System.out.println(n);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
      
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        System.out.println(map);


        for(Integer i : map.keySet()){
            if(map.get(i)>n){
            System.out.println(i +"freqq" + map.get(i));
            }
        }
       
    }

}
