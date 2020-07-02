//demonstrate getInstance() method

/* Date getTime(): It is used to return a Date object representing this Calendar's time value. */

package CalendarClass;
import java.util.*; 

public class Calendar1 { 
    public static void main(String args[]) 
    { 
        Calendar c = Calendar.getInstance(); 
        System.out.println("The Current Date is:" + c.getTime()); 
    } 
} 
