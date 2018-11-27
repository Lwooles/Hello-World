import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteFileExample1 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		// Create the FileOutputStream object
		FileOutputStream output = new FileOutputStream("C:/Users/lisaw/OneDrive/Documents/Study Documents/BIT 504 - Programming I/example2.txt");
		
		String add="";
		
		
		do {
			System.out.println("Would you like to add some text to the file? ");
			add = scanner.next();
			
			if(add.equals("yes") ||add.equals("Yes")) {
				System.out.println("Please neter what you would like to add");
				String addText = scanner.next();
				
				for(int i = 0; i < addText.length(); i++) {
					output.write(addText.charAt(i));
					System.out.println(addText);
				}
								
			}else if (add.equals("no") || add.equals("No")) {
				break;
			}
		}while(add.equals("yes") ||add.equals("Yes"));
		output.close();
		
		}
	}
	


