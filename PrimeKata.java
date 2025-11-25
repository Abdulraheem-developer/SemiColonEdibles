public class PrimeKata{

public static boolean isPrime(int number){

	if(number <= 1) return false;
	
	for(int index = 2; index < number; index++){
		if(number % index == 0){
		  
			return false;
		}
		}
		return true;
	}
	
	 public static int sumPrimeFactors(int number){
	        int sum = 0; 
	        
	    for(int index = 2; index < number; index++){
		if(number % index == 0 && isPrime(index)) sum += index;
		 
	    }
	   return sum;    
	 }
    public static void main(String[] args){
    
      System.out.println(isPrime(7));
      System.out.println(sumPrimeFactors(100));  
}
}

