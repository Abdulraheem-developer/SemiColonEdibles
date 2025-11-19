import java.util.Scanner;

public class RepeatOrTerminate{
public static void main(String[] args){

	Scanner input = new Scanner(System.in); 
	
	String choice;
	
	do{
		System.out.print("Enter the first number: ");
		int firstNumber = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int secondNumber = input.nextInt();
		
		int sum = firstNumber + secondNumber;
		System.out.print(sum)
		
		System.out.print("Do you want to add again (y/n): ");
		choice = input.nextLine();
	
	}while(userInput != "y");
	
	System.out.print("Program terminated!");
	
}
}
