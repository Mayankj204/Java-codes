public class rectangle {
    public void display(int length,int breadth){
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);

    }
      public void display(int side){
        this.display(side,side);
    }
     public void display(){
        System.out.println("Enter length and breadth of rectangle");
    }

    public static void main(String[] args) {
        rectangle ans=new rectangle();
        ans.display(10,20);
        ans.display(10);
        ans.display();
    }
}
