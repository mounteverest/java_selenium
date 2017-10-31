package java_modifiers;
class ABC{  
	   private int num;
	   public int square(int a){
		   //a =12;
		return a*a;
	   }
		   
	
	public void setnum(int number){
		number = number * number;
		num = number;
	}
	public void  getnum(){
		System.out.println(this.num);;
	}
	
}
	public class modi_private{
	   public static void main(String args[])
	   {  
		ABC obj = new ABC();  
		System.out.println(); 
		obj.setnum(10);
		obj.getnum();
		System.out.println(obj.square(23));
	   }

	}
	

