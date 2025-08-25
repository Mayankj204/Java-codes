import java.util.*;

public class charfrequency {

    public static void main(String[] args) {

        String str = "helloHELLOhello";
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
           map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
            } 
            else{
                map.put(str.charAt(i), 1);
            }
        }
System.out.println(map);
    }
}
