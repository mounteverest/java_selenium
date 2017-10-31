package java_demo;

public class basic_array {

		public static void main(String[] args){
			int[] num = {10,20,30,40,50,60};
			int i;
			int total= 0;
			float average = 0;
			for(i=0;i<num.length;i++){
				total += num[i];
				average = total/num.length;
				
				}
			System.out.println("Total is"+total);
			System.out.println("Average is"+average);
			}
		
	
	
}
