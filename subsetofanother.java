import java.util.*;
public class subsetofanother {


    public static void main(String[] args) {
   
int [] arr1 = {1, 2, 3, 4, 5};
int [] arr2 = {1, 2, 9 , 8};
boolean flag=false;
     HashSet<Integer> h2=new HashSet<>();
     for(int i:arr2){
        h2.add(i);
     }
     HashSet<Integer> h1=new HashSet<>();
     for(int i:arr1){
        if(h2.contains(i)){
            h1.add(i);
      
        }
      

     }
     if(h1.equals(h2)){
        System.out.println("arr2 is subset");
       }
       else{
        System.out.println("not subset");
       }
  

    }
}
