import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		int monthNumber;
		String monthText = "";
		System.out.println("Enter then number for a month of the year: ");
		monthNumber = scanner.nextInt();
		
		switch(monthNumber) {
			case 1: {
				monthText = "January";
				break;
			}
			case 2: {
				monthText = "February";
				break;
			}
			case 3: {
				monthText = "March";
				break;
			}
			case 4: {
				monthText = "April";
				break;
			}
			case 5: {
				monthText = "May";
				break;
			}
			case 6: {
				monthText = "June";
				break;
			}
			case 7: {
				monthText = "July";
				break;
			}
			case 8: {
				monthText = "August";
				break;
			}
			case 9: {
				monthText = "September";
				break;
			}
			case 10: {
				monthText = "October";
				break;
			}
			case 11: {
				monthText = "November";
				break;
			}
			case 12: {
				monthText = "December";
				break;
			}
			default: {
				System.out.println("Invalid number");
				break;
			}
					
		}
		if( monthText != null && !monthText.isEmpty()) {
			System.out.println("The month of the year is: " + monthText);
		}

		

	}

}
