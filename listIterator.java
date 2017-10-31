package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class listIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		//System.out.println(city.get(2));
		 ltr = city.listIterator();
		 System.out.println("This is a forward order:");
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		System.out.println("This is a backward order:");
		while(ltr.hasPrevious()){
			System.out.println(ltr.previous());
		}

	}

}
