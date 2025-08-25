import java.util.*;

public class firstnonrepeatingchar {
    public static void main(String[] args) {
        String s="swiss";
        LinkedHashMap <Character ,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } 
            else{
                map.put(ch,1);
            }
           }
       for(char i :map.keySet()){
        if(map.get(i)==1){
            System.out.println(i);
            break;
        }
       }
    }
}