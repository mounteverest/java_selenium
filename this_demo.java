package java_demo;

public class this_demo {

	int age;
	String Address;
	final int num = 10;
	public void get_data(String add,int age){
		this.age = age;
		this.Address = add;
		add = "Arkshire";
		System.out.println(this.age + "  " +this.Address + "  "+add);
	}
	
	public void add(int num1){
		//this.num = 20;
		num1 = num1*this.num;
		System.out.println(num1);
		
	}
	
	public static void main(String[] args){
		this_demo tt = new this_demo();
		tt.get_data("Newyork", 20);
		tt.add(18);
		
	}
}
