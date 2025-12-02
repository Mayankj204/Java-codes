public class B extends A {
    @Override
    public void m1() {
        System.out.println("B class m1 method is running ....");
    }

    @Override
    public void m2() {
        
    }

    @Override
    public void m3() {
        
    }
    // @Override
    // public void m4(){
    //     System.out.println("B class m4 method is running ....");
    // }
    public static void main(String[] args) {
        A obj=new B();
        obj.m1();
        
    } 

}
