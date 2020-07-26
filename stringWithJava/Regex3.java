import java.util.Regex.*;

public class Regex3{
  public static void main(String[] args){
    System.out.println(Pattern.matches("[xyz]", "wbcd")); // false (not x or y or z)
    System.out.println(Pattern.matches("[xyz]", "x")); // true (among x or y or z)
    System.out.println(Pattern.matches("[xyz]", "xxyyyyz")); // false (x and y comes more than onces)
  }
}
