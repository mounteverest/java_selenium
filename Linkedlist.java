package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> obj = new LinkedList<String>();
		obj.add("Kevin");
		obj.add("Leela");
		Collection<String> name = new LinkedList<String>();
		name.add("Mehan");
		name.add("Carter");
		name.add("Nivin");
		name.add("Paul");
		obj.addAll(name);
		obj.addLast("John");
		obj.addFirst("");
		obj.add(2, "Wilson");
		obj.removeLast();
		obj.set(3, "Sam");
		obj.add("Paul");
		obj.offer("kkk");
		obj.pop();
		obj.push("Shirley");
		
		System.out.println(obj.get(0));
		System.out.println(obj.getFirst()+" "+obj.getLast());
		System.out.println(obj.peek()+" "+obj.peekFirst()+" "+obj.peekLast());
		
		for(String x :obj){
		System.out.println(x);
		}
		
		
		
		
		
		ListIterator<String> ltr = null;
		List<String> city = new ArrayList<String>();
		Collection<String> cy = new ArrayList<String>();
		cy.add("Rachel");
		cy.add("Raphael");
		cy.add("Jessy");
		cy.add("Teagan");
		city.addAll(cy);
		city.add("Nelson");
		city.add("Augustine");
		city.set(0, "Kelly");
		city.add(2, "Betty");
		city.add("Betty");
		System.out.println(city.get(2));
		 ltr = city.listIterator();
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
		}
		
		/*for(String bb:city){
			System.out.println(city);
		}*/
		
		    
	}
	
	
	

}
