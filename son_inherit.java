package java_inheritance;

class son_inherit extends Grand_father_inheritance {
	
		son_inherit(){
			System.out.println("This is a Son_inherit Class");
		}
	
	
	
	
	public static void main(String[] args){
		
		son_inherit m = new son_inherit();
		m.city();
		m.ethnicity();
		m.state();
		m.printName();
		m.sports();
		m.music();
		
	
	}
	
	public void sports(){
		System.out.println("Basketball");
	}
	public void printName(){
		System.out.println(super.name);
		System.out.println("Macillam Ford");
	}
	
	public void ethnicity(){
		super.ethnicity();
		System.out.println("Asian");
	}
	
	public void music(){
		System.out.println("Traditional");
	}
}
