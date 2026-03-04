package MultiThreading.CreateThread;

public class Thread2 implements Runnable{
    @Override
    public void run(){
        System.out.println("Mayank");

    }

    public static void main(String[] args) {
        Thread2 t=new Thread2();
        Thread t1=new Thread(t);
        t1.start();
    }
}
