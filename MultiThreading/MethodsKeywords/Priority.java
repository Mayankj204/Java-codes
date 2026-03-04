package MultiThreading.MethodsKeywords;

public class Priority extends Thread{
    public Priority(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getPriority() + " "+ i);
        }
    }

    public static void main(String[] args) {
        Priority t1=new Priority("Charizard");
        // t1.setName("Mayank");
        t1.start();

    }
}
