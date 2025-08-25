public class space {
    public static void main(String[] args) {
        String s= "The match wil be intresting";
        StringBuilder sb=new StringBuilder();
     Character a=' ';
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!=a){
                sb.append(s.charAt(i));
            }
    }
    System.out.println(sb);
}

}
