package java_demo;

public class multi_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] num ={{1,2,3},{4,5,6},{7,8,9}};
		int length;
		int row,col;
		length = num.length;
		System.out.println("Length:"+length);
		for(row=0;row<length;){
			for(col=0;col<num[row].length;col++){
				System.out.println(num[row][col]);
			}
			row++;
		}
		

	}

}
