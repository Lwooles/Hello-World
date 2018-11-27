import java.util.Scanner;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		LinkedList<String> meals = new LinkedList<String>();
		String yesNo;
		
		do {
			
			System.out.println("Would you like to add food to your shopping list? ");
			yesNo = scanner.next();

			if("yes".equals(yesNo)) {
				System.out.println("Please enter your food...");
				String food = scanner.next();
				meals.add(food);
			
			}else {
				System.out.println("Thank you");
			}
			}while("yes".equals(yesNo));
		
		System.out.println("\nFood to buy");
		for(String name: meals) {
			System.out.println(name);
				
		}
		

	}

}
