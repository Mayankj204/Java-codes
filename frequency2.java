public class frequency2 {
   
    public static void main(String[] args) {
    
        String s="aabbccddaaaccddddddddcccccabcabc"; //ddffgghhwwkkk12334AAAA
        int count=0;
        int count1=0;
        int count2=0;
        int count3=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'){
            count++;
           
        }
        if(s.charAt(i)=='b'){
count1++;
    }
    if (s.charAt(i)=='c'){
        count2++;
    }
if(s.charAt(i)=='d'){
    count3++;
}
 
    }
    System.out.println("A occurs "+count+" times");
 System.out.println("B occurs "+count1+" times");
 System.out.println("C occurs "+count2+" times");
 System.out.println("D occurs "+count3+" times");

}
}