package java_demo;

import java.util.Arrays;

public class uniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,6,5,6,5,6,3,4};
		int i,j=0;
		int length;
		//int equal_no = a[0];
		int count =0;
		String unique = Arrays.toString(a);
		System.out.println(unique);
		String equal = unique.substring(0);
		System.out.println(equal);
		System.out.println(unique.length());
		
		length = a.length;
		//Arrays.sort(a);
//		for(i=0;i<unique.length();i++)
//		{
//			
//			System.out.println(unique);
//		}
		
		System.out.println("-----------------------------");

		for(i=unique.length(); i<0;)
		{
			
	   	if(unique.contains(unique.substring(length-1))) 
			{
		
				j++;
				count++;
				

		    	 System.out.println("its not The unique number is:"+unique.substring(i));
			}
		     i--;
			     
		
		
			 
//			
//			else
//			{
//				
//		
//				
//				System.out.println(unique.substring(i) + "is a unique number");
//			     }
//			
	   	
	     	//System.out.println("Count is :"+count);
	     	
	     	
		}
		}
		
	     
		}

	
	
	

