package java_interview;
//find the minimum no.from the array
public class interview_array_minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {70,30,5,40,10,25,2,10,12,14,8};
		int length;
		length = a.length;
		int min = a[0];
		for (int i =0;i<length;i++)
		{						
			
				if(min > a[i])
			{
				min = a[i];
			}
			
			
				
		}
		
		System.out.println("The minimum number is:"+min);

	}

}
