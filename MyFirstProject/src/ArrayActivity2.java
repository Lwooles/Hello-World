import java.util.Scanner;

public class ArrayActivity2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please can you enter the names of 5 animals? ");
		String firstAnimal = scanner.next();
		String secondAnimal = scanner.next();
		String thirdAnimal = scanner.next();
		String fourthAnimal = scanner.next();
		String fifthAnimal = scanner.next();
		
		String[] animals = {firstAnimal,secondAnimal,thirdAnimal,fourthAnimal,fifthAnimal};
		
		System.out.println("The animals you chose are: " + animals[0] +" "+ animals[1] + " "
				+ animals[2] + " " + animals[3] + " " + animals[4]  );
	}

}
