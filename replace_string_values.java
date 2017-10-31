package java_demo;

public class replace_string_values {
	public static void main(String[] args){
		String[] sentence = {"today","is","great","day!"};
		int[] marks = {10,40,20,70};
		System.out.println(sentence.length);
		sentence[2] = "Wonderful";
		marks[1] = 60;
		for(int i =0;i<sentence.length;i++){
			System.out.print((sentence[i]+" "));
			
		}
		System.out.println();
		for(int j=0;j<marks.length;j++){
			System.out.println(marks[j]);
		}
	
	}

}
