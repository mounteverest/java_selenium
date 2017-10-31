package java_interview;

public class Arrayinterview_minimum_3darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a ={{8,4,5},{3,1,7},{6,2,9}};
		int length;
		length = a.length;
		int min =a[0][0];
		for(int row =0;row <length;row++)
		{
			for(int col =0;col <a[row].length;col++)
			{
				//if(row == 0 && col ==0)
				//{
				//	min = a[row][col];
				//}
				//else{
					if( min > a[row][col])
					{
						min = a[row][col];
						System.out.println("The minimum number row" +row +":"+min);
					}
					
				}
				//System.out.print(a[row][col]+" ");
			}
			
			//System.out.println();
			
			
		
			System.out.println();
			System.out.println("The minimum number is:"+min);
	}

}
