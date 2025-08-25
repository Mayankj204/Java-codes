public class toggle {
    public static void main(String[] args) {
        String s = "PhYsiCs";
        System.out.println(s);
       StringBuilder sb = new StringBuilder();

        for(int i=0 ;i<s.length();i++){
            char c = s.charAt(i);
if (Character.isUpperCase(c)){
       sb.append(Character.toLowerCase(c));
}
else
sb.append(Character.toUpperCase(c));

    }
    System.out.println(sb);
}

}
