package java_interview;

import java.util.Scanner;

public class ArrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][4];
		int[][] b = new int[4][4];
		int[][] c = new int[4][4];
		int sum =0;
		
		Scanner scan = new Scanner(System.in);
		int asize_row,asize_col,bsize_row = 0,bsize_col = 0,csize_row,csize_col,i,j,k ;
		System.out.println("Enter the row size:");
		asize_row = scan.nextInt();
		System.out.println("Enter the column size:");
		asize_col = scan.nextInt();
		System.out.println("Enter the A-array elements:");
		for(i=0;i<asize_row;i++)
		{
			for(j =0;j<asize_col;j++)
			{
				a[i][j] = scan.nextInt();

			}
		}
		for(i=0;i<asize_row;)
			
		{
			for(j =0;j<asize_col;j++)
			{
				System.out.print("  "+a[i][j] +"  ");
				//System.out.println();
				
			}
			i++;
			System.out.println();
		}
		System.out.println("Enter the row size for b:");
		bsize_row = scan.nextInt();
		System.out.println("Enter the column size for b:");
		bsize_col = scan.nextInt();
		System.out.println("Enter the b-array elements:");
		for(i=0;i<bsize_row;i++)
		{
			for(j =0;j<bsize_col;j++)
			{
				b[i][j] = scan.nextInt();

			}
		}
		for(i=0;i<bsize_row;)
			
		{
			for(j =0;j<bsize_col;j++)
			{
				System.out.print("  "+b[i][j] +"  ");
				//System.out.println();
				
			}
			i++;
			System.out.println();
		}
		csize_row = asize_row;
		csize_col = bsize_col;
		for(i=0;i<asize_row;i++)
		{
			for(j=0;j<bsize_col;j++)
			{
				for(k=0;k<j;k++)
				{
					sum  = sum + a[i][k]*b[k][j];
				}
				c[i][j] = sum;
			}
		}
		
		for(i=0;i<asize_row;)
		{
			for(j=0;j<bsize_col;j++)
			{
				
				System.out.print(" "+c[i][j]+" ");
			}
			i++;
			System.out.println();
		}
	}

}
