package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class demo_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList<Integer>(18);
		System.out.println("Size is:"+obj.size());
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(2, 70);
		System.out.println(obj);
		System.out.println(obj.get(3));
		obj.add(40);
		obj.add(50);
		obj.add(90);
		System.out.println(obj);
		obj.add(2, 12);
		System.out.println(obj);
		System.out.println(obj.contains(60));
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
		System.out.println(obj.remove(5));
		System.out.println(obj.subList(0, 4));
		System.out.println(obj.lastIndexOf(90));
		System.out.println(obj);
		System.out.println("Size is:"+obj.size());
		obj.set(0, 100);
		System.out.println(obj);
		Collections.sort(obj);
		for(Integer i :obj){
			System.out.println(i);
		}
	}

}
