package java_interview;

public class Decimal_Binary {
	
	public int decimalBinary(int decimal){
		int p =0;
		int binary = 0;
		while(decimal != 0){
			int rem = decimal%2;
			binary  += rem*Math.pow(10, p);
			decimal = decimal/2;
			p++;
		}
		
		return binary;
	}
	

	public static void main(String[] args){
		
		Decimal_Binary obj = new Decimal_Binary();
		System.out.println(obj.decimalBinary(20));
		
	}
}
