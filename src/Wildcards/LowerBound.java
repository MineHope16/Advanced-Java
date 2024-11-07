package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
	
	public void printList (List <? super Number> list) {
		for (Object lists : list) {
			System.out.print(lists + " ");			
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		UnBound obj = new UnBound();
		List<Integer> ll = new ArrayList<Integer>();
		ll.add(3);
		ll.add(4);
		ll.add(6);
		ll.add(7);
		obj.printList(ll);
		
		List<Double> ll2 = new ArrayList<Double>();
		ll2.add(3.5);
		ll2.add(4.6);
		ll2.add(6.1);
		ll2.add(7.0);
		obj.printList(ll2);
		
		List<String> ll3 = new ArrayList<String>();
		ll3.add("Dattaram");
		ll3.add("Sharanya");
		obj.printList(ll3);
	}

}
