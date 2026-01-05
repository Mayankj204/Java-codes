import java.util.*;
class reverseStrings{
private static char[] charArray;
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
      String str=sc.nextLine();
    System.out.println(str);
    reverse(str);
}
public static void reverse(String str){
  int i=0;
  int j=str.length()-1;
  charArray=str.toCharArray();
  while(i<j){
    char temp=charArray[i];
    charArray[i]=charArray[j];
    charArray[j]=temp;
    i++;
    j--;
  }
  System.out.println(new String(charArray));
}
}