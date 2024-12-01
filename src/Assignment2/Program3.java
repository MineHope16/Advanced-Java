package Assignment2;

//Functional Interface
interface arith_operations {
    int add(int a, int b);
}

public class Program3 {
    public static void main(String[] args) {
        //Lambda Expression
        arith_operations obj = (int x, int y) -> (x+y);

        System.out.println("Addition of 2 & 3 is " + obj.add(2,3));
        System.out.println("Addition of 5 & -6 is " + obj.add(5,-6));
    }
}
