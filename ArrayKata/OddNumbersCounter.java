
import java.util.Arrays;
import java.util.Scanner;

public class OddNumbersCounter {

    public static int CountOdd(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }return count;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter elements of the array: ");
            arr[i] = input.nextInt();

        }
        System.out.println("There are " + CountOdd(arr) + " even numbers in the array");

        for(int j = 0; j < size; j++){
            if(arr[j] % 2 == 0){
                System.out.println("The odd numbers are " + Arrays.toString(arr));
            }
        }




    }
}
