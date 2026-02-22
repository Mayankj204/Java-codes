package Abstraction;
public class Car {
    private void ignition(){
        System.out.println("Ignite");
    }
    private void spark(){
        System.out.println(" Spark");
    }

    private void motion(){
        System.out.println("Motion");
    }

    public void start(){
        ignition();
        spark();
        motion();
    }

}
