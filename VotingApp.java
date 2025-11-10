public class VotingApp{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("How old are you?: ");
	int age = input.nextInt();
	
	if(age > 18){
	System.out.println("You are eligible to vote");
	}else{
	System.out.println("You are ineligible to vote");
	}

}
}
