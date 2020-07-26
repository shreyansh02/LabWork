import java.util.Regex.*;

public class Regex2{
  public static void main(String args[]){
    
    Pattern pattern = pattern.compile(".xx.");
    Matcher matcher = pattern.matcher("AxxB");
    
    System.out.println("String matches with given regex: "+ matcher.matches());
  }
}
