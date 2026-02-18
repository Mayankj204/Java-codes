package Sorting;

public class merge {

    private void divide(int [] arr,int start,int end){
        int mid=start + (end-start)/2;
        if(start>=end){
            return;
        }
            divide(arr,start,mid);
            divide(arr,mid+1,end);
            merge(arr,mid,start,end);
          
    }
    private void merge(int [] arr , int mid, int start, int end){
        int [] merger=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int x=0;
       while(i<=mid && j<=end){
        if(arr[i]>=arr[j]){
            merger[x++]=arr[j++];
        }
        else{
            merger[x++]=arr[i++];
        }
       }
       while(i<=mid){
        merger[x++]=arr[i++];
       }
       while(j<=end){
        merger[x++]=arr[j++];
       }
       for(int k=0;k<merger.length;k++){
        arr[start+k]=merger[k];
        
       }
    }

    public static void main(String[] args) {
        int [] arr={1,9,6,8,4,3,2,7};
        merge obj=new merge();
        obj.divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
