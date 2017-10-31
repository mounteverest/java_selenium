package polymorphism_java;

public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank obj = new bank();
		bank abc = new bank_abc();
		bank xyz = new bank_xyz();
		bank rst = new bank_rst();
		System.out.println(obj.interestRate());
		System.out.println(abc.interestRate());
		System.out.println(xyz.interestRate());
		System.out.println(rst.interestRate());
	}

}
