import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int userInt;
		String userInput;
		
		
		
		do {
			System.out.println("Learn your squares and cubes!");
			System.out.println("Enter an integer: ");
			userInt = scnr.nextInt();
			
			
			
			String title = "Number \t Squared  Cubed";
			
			System.out.println(title);
			System.out.println("=========================");
			for(int i = 1; i <= userInt; i++) {
				System.out.println(i + "\t" + (i * i) + "\t" + (i * i * i));
			}
			
			
			
			//multiplication table
			for(int i = 1; i < userInt + 1; i++) {
				System.out.println();
				for(int j = 1; j <= userInt; j++) {
					System.out.print(i * j + "\t");
				}
			}
			
			
			
			System.out.println("");
			System.out.println("Would you like to continue? (y/n): ");
			userInput = scnr.next();
			userInput = userInput.toLowerCase();
		}while(userInput.equals("y"));
		
		
		System.out.println("Goodbye!");
		scnr.close();
	}
	
	
	//CodingBat nearHundred
	public boolean nearHundred(int n) {
		  return ((Math.abs(100 - n) <= 10) ||
		    (Math.abs(200 - n) <= 10));
		}

}
