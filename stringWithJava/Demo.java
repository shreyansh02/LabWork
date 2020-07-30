import java.util.Regex.*;
import java.util.Scanner;

public class Demo{
  public static void main(String[] args){
    
    try(Scanner sc = new Scanner(System.in){
      while(true){
        System.out.println("Enter the Regex Pattern");
        String regexPattern = sc.nextLine();
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher("Welcome to Github");
        boolean found = false;
        
        while(matcher.find()){
          System.out.println("found the text "+ matcher.group() +" strating at index "+ matcher.start() +" and ending at index "+ matcher.end());
          found = true;
        }
        
        if(!found)
          System.out.println("match not found");
      }
    }
    
  }
}
