import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {

        int[] nums = {10, 5, 20, 8,15, 20};
        findSecondLargest(nums);
    }

    public static void findSecondLargest(int[] nums) {

       
        if(nums.length==2){
            if(nums[0]>nums[1]){
                System.out.println(nums[1]);
            }
            else{
                System.out.println(nums[0]);
            }
            return;
        }
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
     
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                secondLargest=largest;
                largest=nums[i];
            }
            else if(nums[i]>secondLargest && nums[i]<largest){
                secondLargest=nums[i];
            }

        }
        System.out.println(secondLargest);

    }
}
