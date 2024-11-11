package Map;
import java.util.ArrayList;
import java.util.HashMap;
public class Q1 {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main (String args[]) {
		//Creating an object of the class HashMap
		HashMap<Integer, String> m = new HashMap<>();
		HashMap n = new HashMap();
		//Inserting into the map
		m.put(101,"Dattaram");
		m.put(102,"Sharanya");
		m.put(103,"Abhishek");
		m.put(104,"Ajay");
		m.put(105,"Sudarshan");
		m.put(106,"Mr.X");
		m.put(107,"John Doe");
		System.out.println(m);
		
		//Accessing the elements in the Map by key
		System.out.println(m.get(103)); //Abhishek
		System.out.println(m.get(106)); //Mr.X
		System.out.println(m.get(108)); //null

		//Assigning the map to another map
		n.putAll(m);
		System.out.println(n.get(105));		
	}
}
