package java_interview;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dd = new Date();
		System.out.println(dd.toString());
		SimpleDateFormat df = new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat nd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(df.format(dd));
		System.out.println(nd.format(dd));
		

	}

}
