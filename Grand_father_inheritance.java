package java_inheritance;

public class Grand_father_inheritance {
	
	String name ="John Oliver";
	public static void  main(String[] args){
		
		 Grand_father_inheritance gp = new Grand_father_inheritance();
		 gp.city();
		 gp.state();
		 gp.ethnicity();
		
	}
	
	public void city(){
		 System.out.println("Denver");
	 }
	
	public void state(){
		System.out.println("Texas");
	}
	public void ethnicity(){
		System.out.println("American");
	}
	
}
