package java_demo;

public class string_demo {
	public static void main(String[] args){
		String name = "  Missisipi and Misouri  ";
		String city = "America";
		String State = "Alabama";
		String country ="America";
		name = name.trim();
		int length,length1;
		length = name.length();
		length1 =  city.length();
		System.out.println("Name length is:"+length);
		System.out.println("City Length is:"+length1);
		System.out.println(name.replace('i','a'));
		System.out.println(name.concat(city));
		System.out.println(name.equals(city));
		System.out.println(name.startsWith("Missi"));
		System.out.println(city.endsWith("ca"));
		System.out.println(name.charAt(17));
		System.out.println(name.indexOf('i'));
		System.out.println(name.isEmpty());
		System.out.println(name.substring(2, 10));
		System.out.println("Compare two Strings:"+(country.compareTo(city)));
		char[] cities = name.toCharArray();
		int length3;
		length3 = cities.length;
		for(int i =0;i<length3;i++){
			System.out.println("cities["+i+"]"+cities[i]);
		}
		
		
		System.out.println(name.toUpperCase());
		System.out.println(city.toUpperCase());
		
			if(name.equals(city)){
				System.out.println("The strings are equal");
			}
	
			else
				System.out.println("The strings are not equal");
				if(name.equals(State)){
					
					System.out.println("The strings are equal");
				}
				else
					System.out.println("The Strings are not equal");
	}
	
	

}
