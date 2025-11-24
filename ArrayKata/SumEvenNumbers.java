import java.util.Scanner;

public class SumEvenNumbers {

   public static int[]  EvenNumbersSum(int[] arr){

       int sum = 0;

     for(int i = 0; i < arr.length; i++){
         if(arr[i] %2 == 0){
             sum += arr[i];
         }
         if (arr[i] % 2 == 0){
             System.out.println("The even numbers  numbers are: " + arr[i]);
         }
     }
       return new int[]{sum};
   }

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the elements in the array: ");
            arr[i] = sc.nextInt();
        }

        int[] result = SumEvenNumbers.EvenNumbersSum(arr);
        System.out.println("The sum of the even numbers of the even numbers in the array is " + result[0]);

        System.out.println("------------------------------------------");

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                System.out.println("The even numbers  numbers are: " + arr[i]);
            }
        }





    }
}
