package Map;
import java.util.*;
public class MyMap {
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

		System.out.println(m.entrySet());

		//Forward Direction
		for (Map.Entry <Integer,String> entry : m.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());			
		}

		//Reverse Direction
		List<Map.Entry<Integer, String>> listEntry = new ArrayList<>(m.entrySet());
		System.out.println(listEntry);

		for(int i=listEntry.size()-1; i>=0; i--) {
			Map.Entry<Integer, String> entry = listEntry.get(i);
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}



		// //Accessing the elements in the Map by key
		// System.out.println(m.get(103)); //Abhishek
		// System.out.println(m.get(106)); //Mr.X
		// System.out.println(m.get(108)); //null
		
		// //Removing the elements from the Map
		// m.remove(104); //Ajay
		// System.out.println(m);
		
		// //Checking if the key is in the Map or not
		// System.out.println(m.containsKey(105)); //TRUE
		// System.out.println(m.containsKey(107)); //TRUE
		// System.out.println(m.containsKey(108)); //FALSE
		
		// //Checking if the value is in the Map or not
		// System.out.println(m.containsValue("Dattaram")); //TRUE
		// System.out.println(m.containsValue("Sharanya")); //TRUE
		// System.out.println(m.containsValue("Sahil")); //FALSE
		
		// //Checking if the Map is empty or not
		// System.out.println(m.isEmpty()); //FALSE
		// System.out.println(n.isEmpty()); //TRUE
		
		// //Getting all the keys in the Map
		// System.out.println(m.keySet());
		
		// //Getting all the values in the Map
		// System.out.println(m.values());

		// //Assigning the map to another map
		// n.putAll(m);
		// System.out.println(n.get(105));		
	}
}
