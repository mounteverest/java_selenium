package java_demo;
import java.util.Date;

import demo_package.AreaofCircle;
import demo_package.addition;

@SuppressWarnings("unused")
public class add_two_different_types {

	public static void main(String[] args){
		add_two_different_types ad = new add_two_different_types();
		AreaofCircle circle = new AreaofCircle();
		addition ads = new addition();
		ads.add(123,345);
		
		Date dp = new Date();
		System.out.println(dp.toString());
		circle.area(12);
		int a = 10;
		float b = 0.21f;
		System.out.println(+a  + " + "+  +b+":"+(a+b));
		System.out.println();
		
	}
	
	
	
}
