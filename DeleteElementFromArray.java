package java_interview;

import java.util.Scanner;

public class DeleteElementFromArray
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {10,5,3,7,8,6,2};
		int x,count = 0;
		int i;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element to be deleted:");
		x = scan.nextInt();
		for(i =0;i<arr.length;i++)
		{
			if(arr[i] == x)
				
			{
				
				for(int j=i;j<arr.length-1;j++)
				{
					arr[j]= arr[j+1];
					count++;
				}
				//count++;
				//break;
				
			}
		}
			if(count == 0)
			{
				System.out.println("There is no such element");
			}
			else
			{
			for( i = 0;i<arr.length-1;i++)
			{
			System.out.println(arr[i]);
			}
			}
		
		
	}

}
