public class number1ToN{
    public static void main(String[] args) {
        int n=10;
        check(1,n);
    }
    public static void check(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i +" ");
        check(i+1,n);
    }

}