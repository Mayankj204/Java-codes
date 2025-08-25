import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<Integer> stack ;

  public  ArrayListStack(){
        stack = new ArrayList<>();
    }
    public void push(int data){
        stack.add(data);
    }
     
    public int pop(){
        if(stack.isEmpty()){
            System.out.println("empty-Underflow condition");
            return -1 ;}
            return stack.remove(stack.size()-1);
    }
    public int peek(){
        if(stack.isEmpty()){
            System.out.println("no element");
            return -1 ;
    }     return stack.get(stack.size()-1);
    }
    public static void main(String[] args) {
        ArrayListStack stack = new ArrayListStack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println("Popped element: " + stack.pop());
        
    }
    
    
}
