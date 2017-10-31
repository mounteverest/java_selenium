package override_polymorphism;

public class lion {
	void animal_sound(){
		System.out.println("roar");
	}
	
	public static void main(String[] args){
		lion obj = new lion();
		obj.animal_sound();
	}
}
