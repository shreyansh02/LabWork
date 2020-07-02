import java.util.Scanner;

public class account {
	int Accno, phone_no;
	float balance_amt = 4773;
	String name;
	
	void getinput() {
		Scanner st = new Scanner(System.in);
		System.out.println("enter account folder name:");
		name = st.nextLine();
		System.out.println("enter account number:");
		Accno = st.nextInt();
		System.out.println("enter Phone number:");
		phone_no = st.nextInt();
		st.close();
	}
	
	void Deposit() {
		Scanner st = new Scanner(System.in);
		getinput();
		System.out.println("enter the ammount you want to deposit:");
		int amt = st.nextInt();
		balance_amt = balance_amt + amt;
		System.out.println("final balance amount: "+ balance_amt);
		st.close();
	}
	
	void withdraw() {
		Scanner st = new Scanner(System.in);
		getinput();
		System.out.println("enter the ammount you want to withdraw:");
		int amt = st.nextInt();
		if(balance_amt - amt < 0)
			System.out.println("Insufficient Balance");
		else {
			balance_amt = balance_amt - amt;
			System.out.println("final balance amount: "+ balance_amt);
		}
		st.close();
	}
	
	public static void main(String[] args) {
		account obj = new account();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. GetInput");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("choice the option:");
		int n = sc.nextInt();
		
		switch(n)
		{
			case 1: obj.getinput();
					break;
					
			case 2: obj.Deposit();
					break;
					
			case 3: obj.withdraw();
					break;
		}
		sc.close();
	}
}
