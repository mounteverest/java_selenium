package java_interview;

public class reverse_string_interview {

	 public String City = "Kansas";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String name = "madam";
		String reverse = "" ;
		String names ="hello there";
		int length;
		//char[] names = name.toCharArray();
		length = name.length();
		System.out.println("Length:"+length);
		for(int i=length-1;i>=0;i--){
			reverse = reverse+name.charAt(i);
			System.out.println(name.charAt(i));
		}
		if(name.compareTo(reverse)== 0)
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
		System.out.println("Reversed String is:"+reverse);
		System.out.println("THe original String is:"+name);
		System.out.println(name.compareTo(reverse));
	}
	
	
		
		
	
 
}
