import java.util.*;

public class VC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        Character a = sc.next().charAt(0);
       String b="aeiou";
    for (int i=0;i<b.length()-1;i++){
        if(a==b.charAt(i)){
            System.out.println("Vowel");
            break;
        }
        else{
            System.out.println("Consonant");
            break;
        }
    }
       
    }
    
}
