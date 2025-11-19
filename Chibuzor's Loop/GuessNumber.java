import java.util.Scanner;
import java.util.Random;

public class GuessNumber{
public static void main(String[] args){


	Scanner input = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.print("Enter a random number from 1 - 100: ");
	int userInput = input.nextInt();
	
	int randomNumber = rand.nextInt(1, 101);
	
	while(userInput != randomNumber){
	if(userInput > randomNumber){
	   System.out.println("Too high, try again!");
	}else if(userInput < randomNumber){
	   System.out.print("Too low, try again");
	}
	
	}
}
}
