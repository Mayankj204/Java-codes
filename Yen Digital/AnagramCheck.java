import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "simlent";

        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        if (map1.equals(map2)) {
            return true;
        }


        return false;
    }
}
