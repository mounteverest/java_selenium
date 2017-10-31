package java_interview;

public class Maximum_arrayInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = {{8,4,5},{3,14,7},{1,2,9}};
		int max = a[0][0];
		int row,col,length;
		length = a.length;
		for(row = 0; row <length; row++)
		{
			for(col = 0; col < a[row].length; col++)
			{
				if (a[row][col] > max)
				{
					max = a[row][col];
				}
			}
		}
		
		
		System.out.println("The Maximum number is:"+max);
	}

}
