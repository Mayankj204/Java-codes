package MultiThreading.Thread3;

public class Thread1 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("Hello");
            i++;
        }

    }
    
}
