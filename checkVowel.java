package java_interview;

import java.util.Scanner;

public class checkVowel {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		char check;
		System.out.println("Enter the letter to be checked for vowel:");
		check = scan.next().charAt(0);
		scan.close();
		boolean isvowel = false;
		switch(check){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':isvowel = true;
		}
		if(isvowel == true){
			System.out.println("This is a "+check+"Vowel");
		}
		else{
			
			
			if((check >='a' && check <='z') ||(check >='A' && check <='Z'))
			{
				System.out.println("This is a " +check+" consonant");
			}
			else{
				System.out.println("This is not a alpahabet");
			}
			
		}
		
}
}