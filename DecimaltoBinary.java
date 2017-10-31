package java_interview;

import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args){
		String binary;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the binary Value:");
		binary = scan.nextLine();
		System.out.println(Integer.parseInt(binary, 2));
	}
}
