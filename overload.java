package overload_polumorphism;

public class overload {
	
	int add(){
		return 4+5;
	}
	double add(double x, double y){
		return x+y;
	}
	
	float add(int m){
		return m*m;
	}
	
	long add(int x,int y,int z,int s){
		return ((x*y)+(z*s));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload obj = new overload();
		System.out.println(obj.add());
		System.out.println(obj.add(20));
		System.out.println(obj.add(23.09, 10.87));
		System.out.println(obj.add(22, 25, 100, 178));
		
		

	}

}
