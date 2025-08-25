import java.util.*;
public class wordfrequency {
    public static void main(String[] args) {

String text = "This is a sample text . This text is just a sample . this";

System.out.println(text);
HashMap <String, Integer> map = new HashMap<>();
String[] words = text.split("\s");  
 for(String i : words){
    map.put(i, map.getOrDefault(i, 0)+1);

 }
System.out.println(map);

    }
    
}
