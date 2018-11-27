import java.util.Scanner;

public class TryItForMe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int [] scores = new int[3]; 

		
		
		for(int i=0;i<scores.length;i++) {
			
			do {
				System.out.println("Please enter a number between 1 and 100: ");
				num =scanner.nextInt();
				if(num<0 || num>100) {
					System.out.println("Invalid option. please try again ");
				}else {
					scores[i] = num;
				}
			}while(num >100 || num<0);
		}
	
	
		System.out.println("Score\tGrade\tComment");
		
		for(int i=0;i<scores.length;i++) {
			int grade =scores[i];
			String gradeText = "";
			String comment = "";
			
			if(grade>90) {
				gradeText = "A";
				comment ="Excellent";
			}else if(grade>70) {
				gradeText= "B";
				comment = "Well done!";
			}else if(grade>50) {
				gradeText = "C";
				comment = "Good job";
			}else if(grade>40) {
				gradeText = "D";
				comment = "Not bad";
			
			}else {
				gradeText="F";
				comment = "Failed";
			}
			System.out.println(grade+ "\t" + gradeText + "\t" +comment);
		}

	}}
	

