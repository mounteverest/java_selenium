package exception_handling;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,num1 = 0;
		num = 10;
		try{
		num= num/num1;
		System.out.println(num);
		}
		catch(ArithmeticException e1){
			System.out.println("Its a ArithmeticException:+e1");
			
		}
		catch(Exception e){
			
			System.out.println("THe error exception is"+e);
		}
		

	}

}
