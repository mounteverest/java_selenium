package java_demo;

import java.util.Scanner;

public class Month_daysArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] month ={31,28,31,30,31,30,31,31,30,31,30,31};
		int length;
		length = month.length;
		System.out.println(length);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Month for noof days:");
		int mo = scan.nextInt();
		scan.close();
		if (mo < 0 || mo >11){
			System.out.println("repeat again");
			
		}

		for(int i=0;i<length;){
			if(mo == i){
				System.out.println("The noof days are"+month[i]);
				break;
			}
			else
			{
				i++;
			}
			
		}
		
	}

}
