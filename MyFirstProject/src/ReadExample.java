import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		
		File file = new File("C:/Users/lisaw/OneDrive/Documents/Study Documents/BIT 504 - Programming I/example1.txt");
		FileInputStream stream = new FileInputStream(file);
		StringBuffer buffer = new StringBuffer();;
		int[] numbers = new int[10];
		int counter = 0;
		int data;
		while((data = stream.read()) != -1) {
			if(data == ',' || data== '!') {		// Comma has been found
				numbers[counter] = Integer.parseInt(buffer.toString());
				counter++;			// Increase the counter by 1
				buffer.setLength(0);// Clear the buffer
			} else {
				buffer.append((char) data);		// Add character to the buffer
			}
		}
		stream.close();
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("Index " + i + " = " + numbers[i]);
		}
	}

}
