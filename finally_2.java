package exception_handling;

public class finally_2 {

	public static String retString(){
		String ss = "Hawai";
		try{
			return ss;
		}
		catch(Exception e){
			System.out.println("The error is"+e);
			return ss;
		}
		finally{
			ss = "Denver";
			System.out.println("Final Block");
		}
	}

public static void main(String[] args){
	
	System.out.println(retString());
	
}

}