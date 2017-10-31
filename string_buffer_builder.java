package java_demo;

public class string_buffer_builder {
	public static void main(String[] args){
		String name = "Alabama";
		System.out.println("old name with string method name:"+name);
		name = "Mexico";
		System.out.println("New name with string method:"+name);
		StringBuffer city = new StringBuffer( "California");
		System.out.println("Old city with String buffer:"+city);
		city = new StringBuffer("Nevada");
		System.out.println("Newcity name with String Buffer:"+city);
		StringBuilder State = new StringBuilder("Denver");
		System.out.println("old state with String Builder:"+State);
		State = new StringBuilder("NewYork");
		System.out.println("New Sate with String Builder:"+State);
		//String new_name = name.reverse();
		System.out.println(city.reverse());
		System.out.println(State.reverse());
		System.out.println(city.length());
		city.setLength(10);
		System.out.println(city.length());
		city = new StringBuffer("MissisipiMisouri");
		System.out.println(city.length());
		 city.setCharAt(0, 'N');
		 System.out.println(city);
		
		
		
		
		
		
		
		
		
		
		
	}
}
