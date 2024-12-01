package Assignment2;

//Functional Interface
interface temprature {
    double temp(double a);
}

//Functional Interface
interface distance {
    double dis(double a);    
}

public class Program4 {
    public static void main(String[] args) {
        temprature obj1 = (double a) -> ((5.0/9.0)*(a-32));
        distance obj2 = (double a) -> (a*0.621371);

        System.out.println("Fahrenheit(134) to Celsius: " + obj1.temp(134));
        System.out.println("Fahrenheit(256) to Celsius: " + obj1.temp(256));
        System.out.println("Kilometer(12km) to Miles: " + obj2.dis(12));
        System.out.println("Kilometer(32km) to Miles: " + obj2.dis(32));

    }

}
