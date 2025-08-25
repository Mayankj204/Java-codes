import java.util.Scanner;
import java.util.Stack;

public class insertElemetAtSpecificPosition {
   
    public static void element(Stack<Integer> stack, int position, int element) {
        if(stack.size()==position){
            stack.push(element);
            return;
        }
        int temp = stack.pop();
        element(stack, position, element);
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Original Stack: " + stack);
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the position at which you have to inster an element");
        int pos=sc.nextInt();
        element(stack, pos,25);
        System.out.println("Stack with inserted element"+ stack);
    }
}
