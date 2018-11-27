import java.util.Scanner; 

public class CalculateTax {
	
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Please enter your first number:");
			int num1 = scanner.nextInt();
			
			System.out.println("Please enter your second number: ");
			int num2 = scanner.nextInt();
			
			if(num1 > num2) {
				System.out.println("The highest number is: " + num1);
			}else if(num2> num1) {
				System.out.println("The highest number is: " + num2);				
			}else
				System.out.println("The numbers are the same");
			}
			
	}


