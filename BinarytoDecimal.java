package java_interview;

public class BinarytoDecimal {

	public int binarytodecimal(int binarynumber){
		int temp ;
		int decimal =0;
		int p =0;
		while(binarynumber != 0){
//			if(binarynumber == 0){
//				break;
//			}
//			else{
			temp = binarynumber%10;
			decimal += temp*Math.pow(2, p);
			binarynumber = binarynumber/10;
			p++;
//			}
		}
		return decimal;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarytoDecimal obj = new BinarytoDecimal();
		System.out.println(obj.binarytodecimal(110));
	}

}
