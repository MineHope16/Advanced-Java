package Assignment2;

//Functional Interface
interface demo {
    String func();
}

public class Program5 {
    public static void main(String[] args) {
        demo obj1 = () -> ("Without return statement");
        demo obj2 = () -> {
            return ("With a return statement");
        };

        System.out.println(obj1.func());
        System.out.println(obj2.func());
    }
}
