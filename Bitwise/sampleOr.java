public class sampleOr {
    public void check(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
               
                    System.out.println(arr[j] +" ");
                 
                }
                   System.out.println();
            }
        }

    public static void main(String[] args) {
     int [] nums={1,2,3,4};
     sampleOr obj=new sampleOr();
     obj.check(nums);
    }
}
 
