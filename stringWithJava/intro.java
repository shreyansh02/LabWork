//sum the lengths of A and B.
//write Yes if A is lexicographically greater than B otherwise print No instead.
// capitalize the first letter in both A and B and print them on a single line, separated by a space.


import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = scan.next();
        scan.close();
        
        /* Sum lengths */
        System.out.println(A.length() + B.length());

        /* Compare lexicographical ordering */
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        /* Print the Strings in desired format */
        System.out.println(capFirstLetter(A) + " " + capFirstLetter(B));
    }
    
    private static String capFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}
© 2020 GitHub, Inc.
