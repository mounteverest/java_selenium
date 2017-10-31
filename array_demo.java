

package java_demo;

import java.util.*;

public class array_demo {
	public static void main(String[] args){
		int[] marks;
		marks = new int[5];
		marks[0] = 50;
		marks[1] = 20;
		marks[2] = 70;
		marks[3] = 10;
		marks[4] = 45;
		int marks_total = 0;
		int sort_marks = 0;
		for(int i=0;i<marks.length;i++){
			if(sort_marks > marks[i]){
				sort_marks= marks[i];
				System.out.println(sort_marks);
			}
			System.out.println("marks_"+i+":"+marks[i]);
			marks_total += marks[i];
			
		}
		
		System.out.println("Total marks:"+marks_total);
		Arrays.sort(marks);
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
		 //
		}
		
				
		
	
}
