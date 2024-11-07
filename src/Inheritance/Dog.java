package Inheritance;

public class Dog extends Animal {
	public void disp_dog() {
		System.out.println("Dog Class");
	}
	
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		a = d;	
		a.disp();
	}

}
