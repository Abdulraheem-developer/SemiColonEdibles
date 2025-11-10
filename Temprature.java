import java.util.Scanner;

public class Temprature{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("What's your temperature: ");
	int temprature = input.nextInt();
	
	if(temprature < 15){
	  System.out.println("Cold");
	}else if(tempraure <= 15 || temprature >= 30){
		System.out.println("Warm");
	}else if(temprature > 30){
	  System.out.println("Hot");
	}else{
		System.out.println("Invalid Input")
	}
	
	
	

}
}
