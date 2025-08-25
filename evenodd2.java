import java.util.Scanner;

public class evenodd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");
        int n = sc.nextInt();
        int b =n;
      System.out.println(  b%2==0? ("number is even") : ("number is odd") );
        
    }
}
