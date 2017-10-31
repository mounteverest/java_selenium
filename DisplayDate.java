package java_demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DisplayDate {
	public static void main(String[] args){
		
		Date dp = new Date();
		System.out.println(dp.toString());
		SimpleDateFormat df = new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat nf = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(df.format(dp));
		System.out.println(nf.format(dp));
	}
}
