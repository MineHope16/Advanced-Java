package Assignment2;

//Functional Interface
interface string_concat {
    String func(String a, String b);
}
public class Program6 {
    public static void main(String[] args) {
        string_concat obj = (String a, String b) -> (a+b);

        System.out.println(obj.func("Hello", "World"));
        System.out.println(obj.func("Hail", "Hydra"));
    }
}
