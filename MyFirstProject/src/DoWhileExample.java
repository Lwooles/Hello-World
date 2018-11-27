import java.util.Scanner;
 
public class DoWhileExample {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int option;
		
		do {
			System.out.println("Select an option between 1 and 5: ");
			option = scanner.nextInt();
			
			if(option <1 || option > 5) {
				System.out.println("Your entered an invalid option");
			}
			
		} while (option < 1 || option > 5);
		
		
			
			System.out.println("You selected option " + option);
			}
	}
 
