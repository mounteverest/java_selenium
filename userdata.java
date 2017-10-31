package getInputs;

import java.util.Scanner;

public class userdata {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		System.out.print("Enter ur name:");
		name = scan.nextLine();
		System.out.print("Enter ur Age:");
		age = scan.nextInt();
		System.out.println("Hi "+name +" Welcome to Java " +"and ur age is "+age);
	}
}
