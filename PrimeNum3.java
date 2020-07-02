public class PrimeNum3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int m = n/2;
		int flag = 0;
		
		if(n==0 || n==1)
			System.out.println(n+" is not a prime.");
		else {
			for(int i=2; i<=m; i++) {
				if(n%i==0) {
					System.out.println(n+" is not a prime");
					flag = 1;
					break;
				}
			}
		}
		
		if(flag==0)
			System.out.println(n+" is a prime");
	}

}
