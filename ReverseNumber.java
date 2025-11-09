import java.util.Scanner;

public class ReverseNumber{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter four digits number to be reversed:  ");
	int number = input.nextInt();
	System.out.println(number);
	
	int digitOne = number % 10;
	number = number / 10;
	
	int digitTwo = number % 10;
	number = number / 10;
	
	int digitThree = number % 10;
	number = number / 10;
	
	int digitFour = number % 10;
	number = number / 10;
	
	System.out.println(digitOne + "" + digitTwo + "" + digitThree + "" + digitFour);
	
	
	

}
}
