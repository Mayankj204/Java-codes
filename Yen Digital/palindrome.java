public class palindrome {
    public static void main(String[] args) {
        String st=new String("madmam");
        boolean isPalindrome=true;
        for(int i=0;i<st.length()/2;i++){
           if(st.charAt(i)!=st.charAt(st.length()-1-i) ){
            isPalindrome=false;
            
              break;
           }
    }
    if(isPalindrome){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not palindrome");
    }
 
} 
}
