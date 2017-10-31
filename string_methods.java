package java_demo;

public class string_methods {
	public static void  main(String[] args){
		String word1 = "Try really";
		String word2 = "Hard";
		System.out.println(word1.concat(" "+word2+" \'in everything!\' "));
		System.out.println(word1.toUpperCase());
		System.out.println(word1.substring(0, 3));
		System.out.println(word1.compareTo(word2));
		char initial = word1.charAt(0);
		System.out.println(initial);
		char last_char = word1.charAt(word1.length()-1);
		System.out.println(last_char);
		String change = word1.replace('l', 'z');
		System.out.println(change);
	}
}
