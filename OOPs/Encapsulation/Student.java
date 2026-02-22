package Encapsulation;

public class Student {
   final int rollno;
    String name;
   String course;
   Student(){
    System.out.println("Running constructor...");
     rollno=10;
   }
    public void setname(String name){
        this.name=name;
    }
    // public void setrollno(int rollno){
    //     this.rollno=rollno;
    // }
    public void setcourse(String course){
        this.course=course;
    }

    public void getname(){
        System.out.println(name);
    }
    public void getrollno(){
        System.out.println(rollno);
    }
    public void getcourse(){
        System.out.println(course); 
    }

   

}
