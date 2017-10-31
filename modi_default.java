package java_modifiers;

 class modi_default {

	int add(int a,int b){
			int sum = a+b;
			return sum;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		modi_default obj = new modi_default();
		System.out.println(obj.add(10, 44));
	}
	
	
}
