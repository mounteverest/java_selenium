package java_modifiers;

 class xyz{
	protected  double cuberoot(int x){
		double cube = Math.cbrt(x);
		return cube;
		
	}
	}

public class modi_protected extends xyz {
	public static void main(String[] args){
		 xyz  obj = new xyz();
		//System.out.print(("CubeRoot is");
		System.out.println("Cuberoot is :" +obj.cuberoot(64));
		
	}

}
