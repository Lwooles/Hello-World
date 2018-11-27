import java.util.Scanner;

public class oddNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int num1 = scanner.nextInt();
		int num = num1 % 2;
		
		switch(num) {
		case 0: {
			System.out.println("Your number is even");
			break;	
		}
		case 1: {
			System.out.println("Your number is odd");
			break;
		}
		}
		

	}

}
