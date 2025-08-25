import java.util.*;
//remove the subsequence that appear two or more than two times in array.
public class subSequence {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        int [] arr={1,2,3,3,4,5,6,6,6,6,7,7,8,9,4,2,2,2}; //output- 1,2,4,5,8,9,4
        for(int i=0;i<=arr.length-1;i++){
          if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            
          else  if(st.peek()==arr[i]){
                    if(i==arr.length-1 ||arr[i]!=arr[i+1]) st.pop();
            }
           
        }
        System.out.println(st);

    }
    
}
