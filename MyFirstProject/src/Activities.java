import java.util.Scanner;

public class Activities {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your middle name? :");
		String middleName = scanner.next();
		System.out.println("What is your last name? : ");
		String lastName = scanner.next();
		
		
		String fullName = middleName + " " + lastName;
		
		System.out.println("Name: " + fullName);
	}

}
