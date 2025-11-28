public class shape {
    public void area(double radius){
          double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
    public void area(int side){
          double area = side * side;
        System.out.println("Area of square: " + area);
    }
    public void area(int length, int breadth){
          double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }

    public static void main(String[] args) {
            shape s=new shape();
            s.area(20);
            s.area(60,5);
            s.area(20.0);
            s.area('1');
            int c='1';
            int ans=(int)c;
            System.out.println(ans);
    }

    
}
