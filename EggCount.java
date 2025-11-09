import java.util.Scanner;

public class EggCount{
 public static void main(String[] args){
  
  	Scanner input = new Scanner(System.in);
  	
  	System.out.print("How many eggs do you have?: "); 
  	int eggsCount = input.nextInt();
  	
  	int dozenEggs = eggsCount/ 12;
  	int leftOver = eggsCount % 12;
  	
  	 int grossCount = 0;
  	
  	if(eggsCount > 500) grossCount =  eggsCount / 144;	
  	
  	System.out.println("Your number of eggs is " + grossCount + " gross, " + dozenEggs + " dozens, and " + leftOver + " left overs" );

  	
 }
}
