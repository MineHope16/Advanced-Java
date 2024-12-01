package Assignment2;

//Creating a function interface
interface lambda_one_parameter {
    void printGreet(String s);
}

public class Program2 {

    public static void main(String[] args) {
        //Lambda Expression
        lambda_one_parameter obj = (String a) -> System.out.println("Hello, " + a);

        obj.printGreet("Dattaram");
    }

}
