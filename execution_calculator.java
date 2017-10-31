package java_interface;

 
public class execution_calculator implements Calculator,Scientific_calculator{
	int x = 30, y = 20,sum = 0;
	int squareroot;
	int cuberoot = 0;
	long logam;
	public static void main(String[] args){
		execution_calculator calc = new execution_calculator();
		calc.add();
		calc.add(5,7);
		calc.subtract();
		calc.multiply();
		calc.division();
		calc.division(23,8);
		execution_calculator scie_calc = new execution_calculator();
		scie_calc.squareroot(15);
		scie_calc.cuberoot(216);
		scie_calc.logarithm(3);
		
		
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		 sum = x+y;
		System.out.println("Sum:"+sum);
		
		
	}
	public  void add(int a, int b){
		sum = a+b;
		System.out.println(sum);
		
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		 sum = x-y;
		System.out.println("Subtraction:"+sum);
		
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		sum = x*y;
		System.out.println("Multiplication:"+sum);
		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		sum = x/y;
		System.out.println("Division:"+sum);
		
	}
	
	public void  division(float m, float n){
		
		
		float sum1 = (m/n);
		System.out.println("division:"+sum1);
	}

	public void squareroot(int sq) {
		// TODO Auto-generated method stub
		 squareroot = sq*sq;
		System.out.println("Square roots"+squareroot);
		
	}

	public void logarithm(int lg) {
		// TODO Auto-generated method stub
		logam = (long) Math.log(lg);
		System.out.println("logarithm"+logam);
		
	}

	public void cuberoot (int cb) {
		// TODO Auto-generated method stub
		cuberoot = (int) Math.cbrt(cb);
		System.out.println("cuberoot:"+cuberoot);
		
	}

	@Override
	public void squareroot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logarithm() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cuberoot() {
		// TODO Auto-generated method stub
		
	}

}
