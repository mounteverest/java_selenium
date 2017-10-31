package java_interview;

public class OctaltoDecimal {

	public int octaltodecimal(int octal){
		int p =0;
		int decimal = 0;
		while(octal != 0){
			int rem = octal%10;
			decimal += rem*Math.pow(8, p);
			octal = octal/10;
			p++;
		}
		return decimal;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OctaltoDecimal obj = new OctaltoDecimal();
		System.out.println(obj.octaltodecimal(5746));
	}

}
