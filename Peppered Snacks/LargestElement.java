public class LargestElement{

public static int findLargest(int[] numbers){
	    	int largest = numbers[0];
	
	  for(int index = 0; index < numbers.length; index++){
	    if(largest < numbers[index]){
	        largest = numbers[index];
	    }
	  }
	    return largest; 
		
	}
	
public static void main(String[] args){

  

	int[] numbers = {34, 65, 87, 92, 45, 78};


	System.out.println(findLargest(numbers));

}
}
