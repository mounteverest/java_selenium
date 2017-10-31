package java_interview;

import java.util.Scanner;

public class MergeTwoArrays
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,first_size,second_size,merge_size,j;
		int[] first_array = new int[10];
		int[] second_array = new int[10];
		int[] merge_array = new int[50];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First element array size");
		 first_size = scan.nextInt();
		System.out.println("Enter the Array elements");
			for(i =0;i<first_size;i++)
			{
				first_array[i] = scan.nextInt();
				merge_array[i] = first_array[i];
			}
		
		//System.out.println(first_array[i]);
		System.out.println("Enter the second array element size:");
		second_size = scan.nextInt();
		System.out.println("Enter the Second Array Elements:");
		for(i=0;i<second_size;i++)
		{
			second_array[i]=scan.nextInt();
		}
		
		//System.out.println(second_array[i]);
		merge_size = first_size+second_size;
		System.out.println(merge_size);
		
		
			for( i=first_size, j=0;  i < merge_size &&  j < second_size; j++,i++)
			 {
			
			
			
			merge_array[i] = second_array[j];
			
			
			}
		
		for(i=0;i<merge_size;i++){
			System.out.println(merge_array[i]);
		}
	}

}
