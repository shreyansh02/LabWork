//The setParseIntegerOnly() method is a built-in method of the java.text.NumberFormat which sets whether or not numbers should be parsed as integers only.
Syntax: public void setParseIntegerOnly(boolean val)

import java.text.NumberFormat;

public class Format2{
  public static void main(String[] args)
    public static void main(String[] args)
	  
	  throws Exception {
		  NumberFormat nf = NumberFormat.getNumberInstance();
		  System.out.println("set initially as: "+ nf.isParseIntegerOnly());
		  
		  //set grouping
		  nf.setParseIntegerOnly(false);
		  
		  //print the final
		  System.out.println("set finally as: "+ nf.isParseIntegerOnly());
	  }
}
output: set initially as: false
        set finally as: false
          
          OR  //set grouping
		          nf.setParseIntegerOnly(true);

              then output: set initially as: false
                       set finally as: true
