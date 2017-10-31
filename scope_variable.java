package java_demo;

public class scope_variable {

	public static void main(String[] args){
		int a;
		{
			a = 5;
		}
		System.out.println(+a);
	}
	
	
}
