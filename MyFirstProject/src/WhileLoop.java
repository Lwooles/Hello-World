import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int i = scanner.nextInt();

		if(i >0) {
			while(i <= 100) {
				System.out.println(i);
				i++;
			}	
		}else {
			System.out.println("Not a valid number");
		}
		

	}

}
