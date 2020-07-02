import java.util.*;
import java.lang.Math;

public class PowerFunction {
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a + b;
            for(double j=1; j<=n; j++){
                System.out.print((int) sum+" ");
                sum += Math.pow(2.0,j) * b;
            }
            System.out.println();
        }
        in.close();
    }
}
