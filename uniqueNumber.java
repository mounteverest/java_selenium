package java_interview;

import java.util.Arrays;

public class uniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,6,3,6,5,6,9,4};
		int i,j=0;
		int length;
		int equal_no = a[0];
		int count =0;
		length = a.length;
		Arrays.sort(a);
		for(i=0;i<length;i++)
		{
			
			//System.out.println(a[i]);
		}
		
		System.out.println("-----------------------------");

		for(i=0;i<=length;)
		{
			
	   	if(equal_no == a[i])
			{
	   		
				j++;
				
				
				System.out.println("i is:"+i);
		       System.out.println("a[i] is:"+a[i]);
		        
			     i++;
			     count++;
			
		}
			 
			
			else{
				
				equal_no = a[j];
				count=0;
				if( j == length-1){
		   			if(count == 0 && a[j] != a[j-1]){
					System.out.println("The unique number is:"+a[i]);
					break;
				}
		   		}
				try{
				if( count ==0  &&  (a[i] != a[i+1])  ) 
				  {
				
			    	 System.out.println("The unique number is:"+a[i]);
			       }	
				
				
				}
				catch(Exception e){
					System.out.println("The Error Exception is"+e);
					
				}
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			     }
			
	   	
	     	System.out.println("Count is :"+count);
	     	
	     	
			
		}
		
	     
		}
	
	
	
}
