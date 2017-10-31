package java_inheritance;

public class grand_son extends son_inherit {
	
	String music = "Gospel";
	grand_son(){
		super();
		System.out.println("Grand_son class is executed");
	}
	
	public static void main(String[] args){
		
		grand_son gs = new grand_son();
		gs.city();
		gs.sports();
		gs.state();
		gs.ethnicity();
		gs.music();
		
	}
	public void music(){
		super.music();
		System.out.println("Contemporary "+ this.music );
	}

}
