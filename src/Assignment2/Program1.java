package Assignment2;

//Fucntional Interface
interface hello_world {
    public void print_hello_world();    
}

public class Program1 {
   public static void main(String[] args) {
     //Creating an object of the interface using the lambda expression
     hello_world obj = () -> System.out.println("Hello World");

     obj.print_hello_world(); 
   }

}
