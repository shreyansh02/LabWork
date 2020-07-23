/*The setCurrency() method is a built-in method of the java.text.NumberFormat which sets the currency used by this number format when formating currency values. 
  This does not update the minimum or maximum number of fraction digits usedby the number format. It overwrites the initially currency.*/

Syntax: public void setCurrency(Currency currency)
Errors and Exceptions: The function throws two types of exceptions 
    1) UnsupportedOperationException: It is thrown if the number format class doesn’t implement currency formatting.
    2) NullPointerException: It is thrown if currency is null.

      
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Currency;

public class Format3{
  public static void main(String[] args) 
    throws Exception {
      NumberFormat nf = NumberFormat.getNumberInstance();
    
      //Initially Currency
      System.out.println("Initially Currency "+ nf.getCurrency());
      
      //Currency set to US
      nf.setCurrency(Currency.getInstance(Locale.CANADA));
           
      //Print the currency
      System.out.println("Currency set as: "+ nf.getCurrency());
  }
}
                     
                     OUTPUT:- Initially Currency: USD
                              Currency set as: CAD
                     
               
public class Format3{
  public static void main(String[] args) 
    throws Exception 
    {
      try {
        NumberFormat nf = NumberFormat.getNumberInstance();
        
        //Initially Currency
        System.out.println("Initially Currency "+ nf.getCurrency());
      
        //Currency set to US
        nf.setCurrency(null);
                       
        //Print the currency
        System.out.println("Currency set as: "+ nf.getCurrency());
      }
      catch (Exception) {
        System.out.println("Exception is: " + e);
      }
    }
}


            OUTPUT:- Initially Currency: USD
                     Exception is: java.lang.NullPointerException
