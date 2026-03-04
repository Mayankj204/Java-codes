package MultiThreading.Thread2;

public class main{
     public static void main(String[] args) {
         World t=new World();
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        t.setName("Mayank Thread");
        System.out.println(t.getName());
      
        int i=0;
        while(i<5){
            System.out.println("Hello");
            i++;
        }
          t.start();
     }

} 