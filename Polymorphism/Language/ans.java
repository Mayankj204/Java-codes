package Polymorphism.Language;

public class ans {
    public static void main(String[] args) {
        Language l;

        l = new English();
        l.greetings();
        l = new French();
        l.greetings();
        l = new Hindi();
        l.greetings();

    }

}
