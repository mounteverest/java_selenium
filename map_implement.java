package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map_implement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> student = new HashMap<Integer,String>();
		student.put(22, null);
		student.put(20,"Augusty");
		student.put(30, "Meghan");
		student.put(40,"Camy");
		student.put(50, "Kevin");
		student.put(60, "Page");
		student.put(null, null);
		student.put(null, null);
		Set s1 = student.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext()){
		
		Map.Entry mentry = (Map.Entry)itr.next();
		System.out.println("The Key is: "+mentry.getKey());
		System.out.println("THe value is:"+mentry.getValue());
		}
		student.remove(60);
		student.put(10, "Sam");
		student.put(90, "Beula");
		System.out.println("             ");
		System.out.println("The new Entries are:");
		Set s2 = student.entrySet();
		Iterator iltr = s2.iterator();
		while(iltr.hasNext()){
			Map.Entry mentry1 = (Map.Entry)iltr.next();
			System.out.println("The new keys are:"+mentry1.getKey());
			System.out.println("The New Values are:"+mentry1.getValue());
		}
	}

}
