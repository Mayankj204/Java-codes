import java.util.Stack;
public class addelementAtBottom {
    public static void bottom (Stack<Integer> s, int n) {
  if (s.isEmpty()) {
        s.push(n) ;
        return;
    }
    int temp = s.pop();
    bottom(s, n);
    s.push(temp);
    }
    public static void main(String[] args) {
    Stack<Integer> s=new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.println("Original Stack: "+s);
     bottom(s, 0);
     System.out.println("New stack : "+s);
}
}