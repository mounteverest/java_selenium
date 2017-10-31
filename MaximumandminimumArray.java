package java_interview;

public class MaximumandminimumArray{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = { {8,4,5},{3,4,7},{1,2,9}};
		int col,row,length;
		length = a.length;
		int max = a[0][0];
		int cols =0;
		for(row=0;row<length;row++)
		{
			for(col=0;col<a[row].length;col++)
			{
				if(a[row][col] > max)
				{
					max = a[row][col];
					cols = col;
					System.out.println("The column is:"+cols);
					System.out.println("THe maximum No is:"+max);
				}
			}
		}

		int min = a[0][cols];
		int k =0;
		while(k<length)
		{
			if(a[k][cols]< min)
			{
				min = a[k][cols];
				
			}
			k++;
			
		}
		System.out.println("The minimum no/is:"+min);
	}

}
