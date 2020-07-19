// Java Program to illustrate NumberFormat class use

package numberFormatClass;
import java.util.*; 
import java.text.*;

public class Format1 {

	public static void main(String[] args) {
			double d = 123456.789; 
			NumberFormat nf = NumberFormat.getInstance(Locale.ITALY); 
			System.out.println("ITALY representation of " + d + " : "+ nf.format(d)); 
	}
}
