package exception_handling;

public class Finally {
	
	

	public static int retint(){
		int a= 100;
	try
	{
		return a ;
	}
	catch(Exception e){
		System.out.println("THe error is"+e);
		return a;
	}
	finally{
		System.out.println("Final block");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(retint());

	}

}
