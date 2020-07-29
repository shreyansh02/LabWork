import java.util.Regex.*;

public class Regex4{
  public static void main(String[] args){
    
    System.out.println("? quantifier ...");
    System.out.println(Pattern.matches("[xyz]?", "a")); // true (x or y or z comes one time)
    System.out.println(Pattern.matches("[xyz]?", "aaa")); // false (a comes more tha one times)
    System.out.println(Pattern.matches("[xyz]?", "ayyyyz")); // false (a or z comes one time but y comes more than once)
    System.out.println(Pattern.matches("[xyz]?", "amnta")); // false (a comes more than one time)
    System.out.println(Pattern.matches("[xyz]?", "ay")); // false (a or y or z must come onces)
    System.out.println(Pattern.matches("[xyz]?", "")); // true (a or y or z or nothing)
    
    System.out.println("+ quantifier ...");
    System.out.println(Pattern.matches("[xyz]+", "a")); // true (x or y or z once or more time)
    System.out.println(Pattern.matches("[xyz]+", "aaa")); // true (x or y or z once or more time)
    System.out.println(Pattern.matches("[xyz]+", "aayyyzz")); // true (x or y or z once or more time)
    System.out.println(Pattern.matches("[xyz]+", "aammta")); // false (m and t are not matching pattern)
    
    System.out.println("* quantifier ...");
    System.out.println(Pattern.matches("[xyz]*", "ayyyza"); // false (x or y or z may come zero or more time)
                       
  }
}
