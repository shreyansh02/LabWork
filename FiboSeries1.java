
import java.util.*;

class fibseries {
		void fib(int n, int a, int b){
			int c;
			System.out.print(a+" ");
			c = a + b;
			a = b;
			b = c;
			n--;
			
			if(n!=0)
				fib(n, a, b);
	}
}

public class FiboSeries1 {

	public static void main(String[] args) {
		fibseries obj = new fibseries();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit of the series: ");
		int n = sc.nextInt();
		int a=0,b=1;
		System.out.println("Fibonacci series: ");
		obj.fib(n,a,b);
		sc.close();
	}

}
