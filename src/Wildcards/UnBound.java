package Wildcards;
import java.util.ArrayList;
import java.util.List;

public class UnBound {
	public void printList (List <?> list) {
		for (Object lists : list) {
			System.out.print(lists + " ");			
		}
	}
	
	public static void main(String[] args) {
		UnBound obj = new UnBound();
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(3);
		ll.add(4);
		ll.add(6);
		ll.add(7);
		obj.printList(ll);
	}
}
