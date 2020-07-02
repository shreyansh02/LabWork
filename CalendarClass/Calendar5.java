//demonstrate add() method

package CalendarClass;
import java.util.*; 

public class Calendar5 { 
    public static void main(String[] args) 
    { 
        // creating calendar object 
        Calendar calendar = Calendar.getInstance(); 
        calendar.add(Calendar.DATE, -15); 
        System.out.println("15 days ago: " + calendar.getTime()); 
        calendar.add(Calendar.MONTH, 4); 
        System.out.println("4 months later: " + calendar.getTime()); 
        calendar.add(Calendar.YEAR, 2); 
        System.out.println("2 years later: " + calendar.getTime()); 
    } 
} 
