package MultiThreading.Lifecycle;

public class Main extends Thread{
    
    @Override
    public void run() {
        System.out.println("running");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
   
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
       Main t1=new Main(); // new
       System.out.println(t1.getState());
       t1.start(); // runnable
       System.out.println(t1.getState());
       Thread.sleep(1000); //running
       System.out.println(t1.getState());
       t1.join(); // terminated
       System.out.println(t1.getState());



    }

}
