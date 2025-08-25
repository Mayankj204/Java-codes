import java.util.*;
public class empty {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the string");
  String s=sc.nextLine();
  int n = s.length();
  System.out.println("Length of string is " + n);
    if(s.length()==0){
        System.out.println("String is empty "  );
    }
else{
    System.out.println("String is not empty "  );
}
}
}
