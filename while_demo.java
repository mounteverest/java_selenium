package java_demo;

public class while_demo {

	public static void main(String[] args){
		int[] a ={1,2,3,4,5,6,7,8,9,10};
		int i=0;
		int sum ;
		int mul = 8;
		while(i<a.length)
		{
			sum = a[i]*mul;
			System.out.println( +a[i]  +"*" +mul +"=" +sum );
			i++;
		}
	}
}
