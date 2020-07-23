/*The getCurrency() method is a built-in method of the java.text.NumberFormat returns the currency which is used while formatting currency values by this currency. 
  It can be null if there is no valid currency to be determined or if no currency has been set previously.*/
  
Syntax: public Currency getCurrency()
Errors and Exceptions: The function throws UnsupportedOperationException when the number format class doesn’t implement currency formatting.

import java.text.NumberFormat; 
import java.util.Locale; 

public class Format4{
  public static main(String[] args){
    throws Exception{
      
      //Get the Instance
      NumberFormat nf = NumberFormat.getInstance();
      
      //Stores the values 
      String values = nf.getCurrency.getDisplayName();
      
      //print the currency
      System.out.println(values);
    }
  }
}

              OUTPUT:- US Dollar

public class Format4 { 
    public static void main(String[] args) 
        throws Exception 
    { 
        // Get the instance 
        NumberFormat nF = NumberFormat.getNumberInstance(); 
  
        // Sets the currency to Canadian Dollar 
        nF.setCurrency(Currency.getInstance(Locale.CANADA)); 
  
        // Stores the values 
        String values = nF.getCurrency().getDisplayName(); 
  
        // Prints the currency 
        System.out.println(values); 
    } 
} 

              OUTPUT:- Canadian Dollar
