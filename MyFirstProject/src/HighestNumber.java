import java.util.Scanner;

public class HighestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your first number: ");
		int first = scanner.nextInt();
		System.out.println("Please enter your second number: ");
		int second = scanner.nextInt();
		System.out.println("Please enter your third number: ");
		int third = scanner.nextInt();
		
		if (first >(second | third)) {
			System.out.println( first + " is the highest number");
		}else if 
			(second > (first | third)) 
			System.out.println( second + " is the highest number");
		else {
				System.out.println( third + " is the highest number ");
			}
	}
}



		

	


