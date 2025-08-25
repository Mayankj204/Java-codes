public class sort0sand1s {
    public static void main(String[] args) {

        int [] arr = {0, 1,0,2,1,2,2,0,1};
        int [] temp = new int [arr.length];
        int count = 0;
         for(int i=0;i<=2;i++){
      for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
              temp[count]=i; 
              count++;
                }
            }
         }
for (int i=0;i<temp.length;i++){
    System.out.print(temp[i]+" ");
}

    }
}
