package MultiThreading.Thread2;

public class World  extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<5){
            System.out.println("World");
            i++;
        }
    }
}
