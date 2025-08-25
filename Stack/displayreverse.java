import java.util.Stack;

public class displayreverse {
    public static void reverseStack(Stack<Integer> stack) {
   if( stack.isEmpty() ) {
   
    return;
   }
   int temp = stack.pop();
   System.out.print(temp + " ");
   reverseStack(stack);
   stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> s =new Stack<>();
        Stack<Integer> r =new Stack<>();
        Stack<Integer> t =new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
       
System.out.println(s);
 
reverseStack(s);
    }
}