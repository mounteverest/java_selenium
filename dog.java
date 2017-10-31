package override_polymorphism;

public class dog extends animal{

	@Override
	void animal_sound() {
		// TODO Auto-generated method stub
		System.out.println("Barks");
	}
	
	public static void main(String[] args){
		dog obj = new dog();
		obj.animal_sound();
	}

}
