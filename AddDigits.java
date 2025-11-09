import java.util.Scanner;

public class AddDigits{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number between 1 and 1000: ");
	int number = input.nextInt();
	
	int digitOne = number % 10;
	number = number / 10;
	int digitTwo = number % 10;
	number = number / 10;
	int digitThree = number % 10;
	
	int sum = digitOne + digitTwo + digitThree;
	
	System.out.print(sum);
}
}
