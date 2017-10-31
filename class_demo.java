package java_demo;

public class class_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		header head_validation = new header();
		footer footer_valid = new footer();
		Images image_valid = new Images();
		System.out.println(head_validation.validate_header());
		System.out.println(footer_valid.Validate_footer());
		image_valid.image_vlaidation();
	}

}
