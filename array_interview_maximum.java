package java_interview;

public class array_interview_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {100,200,30,12,450,34,89,432,200,88};
		int length;
		length = a.length;
		int max =a[0];
		for(int i =0;i<length;i++)
		{
			
				if(a[i] > max)
				{
					max = a[i];
				}
		}
		System.out.println("the maximum number is:"+max);
	}

}
