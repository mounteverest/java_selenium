package set;

import java.util.HashSet;
import java.util.Iterator;


public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> obj = new HashSet<String>();
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Orange");
		obj.add("Grapes");
		obj.add("Banana");
		//obj.addAll(null);
		
		obj.size();
		System.out.println(obj.isEmpty());
		for(String x:obj){
			System.out.println(obj);
		}
		Iterator<String>  itr = obj.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
