public class orOfSubarray {
        public void check(int[] arr){
            int n=arr.length;
            for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    for(int k=i;k<=j;k++){
                        System.out.println(arr[k] +" ");
                    }
                    System.out.println();
                }
            }
        }

    public static void main(String[] args) {
     int [] nums={1,2,3,4};
     orOfSubarray obj=new orOfSubarray();
     obj.check(nums);
    }
}
