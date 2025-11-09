import java.util.Scanner;

public class DiceGame{
  public static void main(String[] args){
  
  	Scanner input = new Scanner(System.in);
  
      
       int pick;
       
       do{
           System.out.print("Roll a dice (Your pick shouldn't be more than 6): ");
           pick = input.nextInt();
            
              if(pick > 6 || pick < 1){
                System.out.println("Oga! Oga! Oga! Your pick should be between 1 and 6!.");
              }
           
       }while(pick > 6 || pick < 1);
       
       System.out.print("The first die: ");
        int firstRoll = input.nextInt();
        
        System.out.print("The second die: ");
        int secondRoll = input.nextInt();
        
        
        int totalRoll = firstRoll + secondRoll;
        System.out.print("Your total Roll is " + totalRoll);
        
       
       
       
  			   	
  }
}
