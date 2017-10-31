package hashmap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hash = new Hashtable<Integer,String>();
		hash.put(10,"AA");
		hash.put(20, "BB");
		hash.put(30, "CC");
		hash.put(40, "DD");
		hash.put(50, "KK");
		//hash.put(10,null);
		Set elements = hash.entrySet();
		Iterator itr =elements.iterator();
		while(itr.hasNext()){
			Map.Entry  mentry  = (Map.Entry)itr.next();
			System.out.println("The key is"+mentry.getKey());
			System.out.println("The Value is:"+mentry.getValue());
		}

	}

}
