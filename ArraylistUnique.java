package java_interview;

import java.util.ArrayList;

public class ArraylistUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num ={4,5,5,5,4,9,6,6,4};
		int length;
		int count =0;
		length = num.length;
		ArrayList<Integer> dup = new ArrayList<Integer>();
		for(int i=0;i<length;i++)
		{
			System.out.println(dup.add(num[i]));
				
			}
//		
//		if(dup.){
//			System.out.println("Good");
//		}
		
		

	}

}
