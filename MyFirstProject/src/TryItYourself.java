import java.util.Scanner;

public class TryItYourself {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Please enter your first name: ");
		 String firstName = scanner.next();
		 System.out.println("Please enter your last name: ");
		 String lastName = scanner.next();
		 System.out.println("What is your age?: ");
		 int age = Integer.parseInt(scanner.next());
		 System.out.println("What is your favourite number?: ");
		 int favNum = Integer.parseInt(scanner.next());
		 
		 System.out.println("Hello, " + firstName + " " + lastName + ". " + '\n' + 
				 "Your are " + age + " years old. " + '\n'+
				 "Your favourite number is " + favNum + "." );
		
		 
		 
		

	}

}
