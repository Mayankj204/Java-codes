package MultiThreading.Thread3;

public class Main {
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread t=new Thread(t1);
        t.start();
        for(int i=0;i<=5;i++){
            System.out.println("Mayank " );
        }
        // t1.start();
  

    }
}
