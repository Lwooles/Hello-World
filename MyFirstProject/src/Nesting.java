import java.util.Scanner;

public class Nesting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age, height, weight;
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		
		if(age >= 10) {
			
			System.out.println("Enter your height(cm): ");
			height = scanner.nextInt();
			
			System.out.println("Enter your weight(kg): ");
			weight = scanner.nextInt();
			
			if(height < 150) {
				System.out.println("You are too short sorry...");
			}
			else if(height > 200) {
				System.out.println("You are too tall sorry...");
			} else {
				if(weight>=110) {
					System.out.println("Your are too heavy to ride");
				}else {
					System.out.println("Enjoy your ride");
				}
			}
		} else {
			System.out.print("Sorry, you must be 10 or older to ride the roller coaster");
		}
	}
}
