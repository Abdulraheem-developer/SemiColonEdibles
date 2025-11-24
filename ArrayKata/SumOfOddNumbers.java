import java.util.Scanner;

public class SumOfOddNumbers {

    public static int [] sumOddNumbers(int[] arr){

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        } return new  int []{sum};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter the elements in the array: ");
            arr[i] = sc.nextInt();

        }

        System.out.println("------------------------");
            int[] result = SumOfOddNumbers.sumOddNumbers(arr);
        System.out.println("The sum of odd numbers is " + result[0]);
        System.out.println("------------------------------------------");

        System.out.print("The odd numbers are: ");
        for(int i = 0; i < size; i++){
                if (arr[i] % 2 != 0){
                    System.out.print(arr[i] + " ");
                }

        }

    }
}
