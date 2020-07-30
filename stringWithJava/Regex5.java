import java.util.Regex.*;

public class Regex4{
  public static void main(String[] args){
    
    System.out.println("MetaCharacter d ...."); // d means digit
    System.out.println("d", "abc"); // false (non-digits)
    System.out.println("d", "1"); // true (digit and comes once)
    System.out.println("d", "4443"); // false (digits but comes more than onces)
    System.out.println("d", "321abc"); // false (digits and characters)
    
    System.out.println("MetaCharacter D ...."); // D means non-digit
    System.out.println("D", "abc"); // false (non-digits but comes more than onces)
    System.out.println("D", "1"); // false (digit)
    System.out.println("D", "4443"); // false (digit)
    System.out.println("D", "323abc"); // false (digit and char)
    System.out.println("D", "m"); // true (non-digit and comes onces)
    
    System.out.println("MetaCharacter D with quantifier ....");
    System.out.println("D*", "abc"); // true (non digits and may comes 0 or more times)
    
  }
}
