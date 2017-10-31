package override_polymorphism;

public class fox {
	void animal_sound(){
		System.out.println("howl");
	}
	
	public static void main(String[] args){
		fox obj = new fox();
		obj.animal_sound();
	}
}
