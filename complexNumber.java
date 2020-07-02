import java.util.Scanner;

public class complexNumber {
	
	int a1, b1;
	int a2, b2;
	
	complexNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the real numbers for complex numbers a1,b1,a2 and b2: ");
		a1 = sc.nextInt();
		b1 = sc.nextInt();
		a2 = sc.nextInt();
		b2 = sc.nextInt();
		System.out.println("complex numbers are: ");
		System.out.println("z1="+a1+"i"+b1);
		System.out.println("z1="+a2+"i"+b2);
		sc.close();
	}
	void add() {
		System.out.println("Addition of two complex number Z1 and Z2: ");
		int A=a1+a2 ,B=b1+b2;
		System.out.println(A+"i+"+B);
	}
	void subtract() {
		System.out.println("Subtraction of two complex number Z1 and Z2: ");
		int A=a1-a2 ,B=b1-b2;
		System.out.println(A+"i+"+B);
	}
	void multiply() {
		System.out.println("Multiplication of two complex number Z1 and Z2: ");
		int A=a1*b2+a2*b1 ,B=-a1*a2+b1*b2;
		System.out.println(A+"i+"+B);
	}
	
	public static void main(String[] args) {
		complexNumber obj = new complexNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ADD");
		System.out.println("2. SUBTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("choice the option:");
		int n = sc.nextInt();
		
		switch(n)
		{
			case 1: obj.add();
					break;
			case 2: obj.subtract();
					break;
			case 3: obj.multiply();
					break;
					
			default: System.out.println("Invlaid Input."); 
		}
		sc.close();
	}

}
