package MultiThreading.MethodsKeywords;

public class time extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        time t = new time();
        t.start();    
        t.join();
        System.out.println("Finished");

    }
}
