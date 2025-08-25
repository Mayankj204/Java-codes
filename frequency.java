import java.util.*;
public class frequency{
  public static void main(String[] args) {
int [] arr={1,1,1,2,2,3,3,3,3,2,1,2,6,6,7};
HashMap<Integer,Integer> map=new HashMap<>();
int n=arr.length;
for (int i=0;i<n;i++){
    map.put(arr[i],map.getOrDefault(arr[i] , 0) + 1);
   
}
System.out.println(map);

  }
}
