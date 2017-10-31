package override_polymorphism;

public class cat {
	void animal_sound(){
		System.out.println("meow");
	}
	
	public static void main(String[] args){
		cat obj = new cat();
		obj.animal_sound();
	}
}
