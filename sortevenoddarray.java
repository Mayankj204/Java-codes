public class sortevenoddarray {
    public static void main(String[] args) {
        int [] arr = { 5, 2, 8, 1, 9 ,6}; //2,8,6,5,1,9
        int f=0;
        int l=arr.length-1;
        while (f < l) {
            if(arr[f]%2!=0 && arr[l]%2==0){
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;

            }
            if(arr[f]%2==0){
                f++;
            }
            if(arr[l]%2!=0){
                l--;
            }
          
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
