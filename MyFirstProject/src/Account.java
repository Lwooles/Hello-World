
public class Account {

	private static double fee;

	public Account(String string, int i, double d) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Create account object for John
		Account johnAccount = new Account("John",1234567,450.76);
		
		// Create account object for Mary
		Account maryAccount = new Account("Mary",637537558, 111.11);
		
		
		// Set the account fee
		Account.fee = 12.40;
		
		// Display account fees
		System.out.println("John's fee: " + johnAccount.fee);
		System.out.println("Mary's fee: " + maryAccount.fee);
		
		// Change account fee
		Account.fee = 6.20;
		
		// Display account fees again
		System.out.println("John's fee: " + johnAccount.fee);
		System.out.println("Mary's fee: " + maryAccount.fee);

	}

}
