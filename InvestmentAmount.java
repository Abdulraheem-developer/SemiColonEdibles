import java.util.Scanner;

public class InvestmentAmount{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter investment amount: ");
	double investment = input.nextDouble();
	
	System.out.print("Enter annual interest rate in percentage: ");
	double interestRate = input.nextDouble();
	
	System.out.print("Enter the number of the years: ");
	int years = input.nextInt();
	
	double futureInvestmentValue = investment * 1 + interestRate;
	double result = Math.pow(futureInvestmentValue, 12);
	System.out.print(result);
}
}
