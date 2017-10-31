package java_demo;

public class constructor_demo {

	public constructor_demo(){
		
		System.out.println("Constructor Demo");
		
	}
	
	public constructor_demo(int a,int b){
		int c;
		c = a*b;
		System.out.println(c);
	}
	public constructor_demo(String a){
		System.out.println(a);
	}
	public static void main(String[] args){
		
		constructor_demo cd = new constructor_demo();
		constructor_demo fc = new constructor_demo(4,10);
		constructor_demo str = new constructor_demo("Hello");
		
		
	}
}
