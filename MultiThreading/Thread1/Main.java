public class Main {
    public static void main(String[] args) {
        System.out.println("Thread starts");
        
      Threadm t=new Threadm(); 
      Thread1 t1=new Thread1();
        t.start();
        t1.start();
         System.out.println("Thread ends");
    }
    
}
