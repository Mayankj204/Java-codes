public class ArrayStack {
    private int[] stack;
    private int top;
    private int size;

    public ArrayStack(int sizeOfArr) {
        size = sizeOfArr;
        stack = new int[size];
        top = -1;
    }


    public void push(int value){
        if(top<size-1){
            stack[++top]=value;
         return;
         } else{
            System.out.println("Stack is full");
         }
    }

    public int pop(){
        if(top==-1){ 
            System.out.println("Stack is already empty");
            return -1;
        }
        return stack[top--];
    }
    public int peek(){
        if (top==-1) {
            System.out.println("No elements");
            return -1;
        }
        return stack[top];
    }
    public boolean isEmpty(){
        
            return top==-1;
    }
    public void display (){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+" ");
        }    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        stack.display();
    }

    
}
