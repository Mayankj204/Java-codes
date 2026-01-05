import java.util.*;

public class countFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        check(str);
    }
    public static void check(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:str.toCharArray()){
            map.put( c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
