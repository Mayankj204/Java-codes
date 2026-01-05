import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {

        String str = "aabbbmsde";
        findFirstNonRepeating(str);
    }

    public static void findFirstNonRepeating(String str) {

      Map<Character,Integer> map=new HashMap<>();
     for(char c:str.toCharArray()){
        map.put(c,map.getOrDefault(c,0)+1);
     }
     for(char c:str.toCharArray()){
        if(map.get(c)==1){
            System.out.println(c);
            break;
        }
     }
    }
}
