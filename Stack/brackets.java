import java.util.*;
// minimum no of brackets removed to make string valid
public class brackets {
    public static void main(String[] args) {
        Stack st = new Stack<>();
        String s = new String("())(");
        int bracketCounter=0;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(s.charAt(i));
            else if(s.charAt(i)==')'){
                if(st.isEmpty()) bracketCounter++; 
                else{
                    st.pop();  
                }
            }
        }
        int totalBrackets=st.size()+bracketCounter;
       System.out.println(totalBrackets);
      
    }
}
 