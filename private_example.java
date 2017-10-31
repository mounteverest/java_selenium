package java_modifiers;

  class Inventory{
	private String name;
	private int age;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
public class private_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private_example obj = new private_example();
		Inventory obje = new Inventory();
		obje.setName("lsdfjsad");
		obje.setAge(20);
		obje.setAddress("dlfjsad");
		System.out.println(obje.getName());
		System.out.println(obje.getAge());
		System.out.println(obje.getAddress());

	}

}
