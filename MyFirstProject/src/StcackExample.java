import java.util.Scanner;
import java.util.Stack;

public class StcackExample {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Stack<String> jobs = new Stack<>();

		do {
			System.out.println("Would you like to complete a task or would you like to add a new task?  \n "
					+ "1. Add a task \n 2. Complete a task "  );	
			int option = scanner.nextInt();
			
			if(option==1) {
				System.out.println("What job would you like to add? ");
				String newTask = scanner.next();
				jobs.push(newTask);
				
			}else if(option ==2) {
				
				if (jobs.size()>0) {
					System.out.println("Job completed successfully! ");
					jobs.pop();
					}else {
						System.out.println("Invalid option!");
					}
				
			}
			
		}while (jobs.size()>0);
		System.out.println("All jobs completed!! ");
		
		
	}

}
