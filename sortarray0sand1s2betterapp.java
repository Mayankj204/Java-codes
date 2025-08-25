public class sortarray0sand1s2betterapp {
    public static void main(String[] args) {
      int [] arr = {1, 0,1,0,1,1,0};
      int count =0;
      for (int i=0;i<arr.length;i++){
        if(arr[i]==0){
            arr[count++]=0;
        }
      }
      while(count<arr.length){
        arr[count++]=1;
      }
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }



    }
    
}
