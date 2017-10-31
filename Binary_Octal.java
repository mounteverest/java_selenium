package java_interview;

public class Binary_Octal {
	
	public int binary_Octal(int binary){
		int p =0;
		int octal = 0;
		while(binary != 0){
			int rem = binary%10;
			octal += rem*Math.pow(2, p);
			binary = binary/10;
			p++;
			
	     	}
		
		
	
//	public int octal(){
//	if(octal ==10){
//		octal ='A';
//		if(octal ==11){
//			octal ='B';
//			if(octal == 12){
//				octal='C';
//				if(octal == 13){
//					octal='D';
//					if(octal ==14){
//						octal='E';
//						if(octal==15){
//							octal='F';
//						}
//					}
//				}
//			}
//		}
//	}
	
	return octal;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		Binary_Octal obj = new Binary_Octal();
		
		System.out.println("calling bo function ");
		System.out.println(obj.binary_Octal(1111));
		//System.out.print(obj.octal(obj.binary_Octal(1111));

	}

}
