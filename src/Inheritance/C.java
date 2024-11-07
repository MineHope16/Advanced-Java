package Inheritance;

public class C extends B{
	
	public void show_c () {
		System.out.println("Class C method.");
	}
	
	public static void main(String[] args) {
		C obj = new C();
		obj.show_a();
		obj.show_b();
		obj.show_c();
	}

}
