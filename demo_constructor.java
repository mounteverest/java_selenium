package java_constructor;

public class demo_constructor {
	
		String display;
		int version;
	
		demo_constructor(){
			this.display = "Java";
			this.version =8;
			System.out.println(this.display + "  " +this.version);
	}
	
		demo_constructor(int ver,String disp){
			//System.out.println(ver + "  " + disp);
			 this.version =ver;
			 this.display =disp;
		}
	public static void main(String[] args){
		//demo_constructor dc = new demo_constructor();
		demo_constructor dp = new demo_constructor(5,"Linux");
		System.out.println(dp.display + "  " +dp.version) ;
	}
}
