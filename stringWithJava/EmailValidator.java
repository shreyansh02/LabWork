import java.util.regex.*;
import java.util.Scanner;

public class EmainValidator{
  public static void main(String[] args){
     try(Scanner sc = new Scanner(System.in)){
        String mydomian = sc.nextLine();
        String emailRegex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
        Boolean b= mydomain.matches(emailRegex);
        
        if(b==false){
            System.out.println("Email Address is Invalid");
        }else if(b==true){
            System.out.println("email Address is Valid");
        }
        
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage);
        }
        
     }
  }
}
