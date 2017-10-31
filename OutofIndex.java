package exception_handling;

public class OutofIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,20,30};
		int[] num = {3,4,5};
		int x = 10;
		
		int i =0,j = 0;
		i = arr.length;
		j = num.length;
		System.out.println(j);
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		try{
			//x =(x/0);
			x= x/2;
			System.out.println(x);
			//System.exit(0);
			
		}
		
		catch(Exception e2){
			System.out.println("The error is"+e2);
		}
		try{
			//System.out.println(num[3]);
			System.out.println(num[1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The Error is"+e);
		}
		catch(ArithmeticException e1){
			System.out.println("The error is "+e1);
		}
		finally{
			System.out.println("We are out");
		}
		
		}

	}


