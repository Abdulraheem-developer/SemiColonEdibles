import java.util.Arrays;
import java.util.Scanner;

public class CountEvenNumbers {

    public static int CountEven(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
        }return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array:  ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the elements in the array:  ");
            arr[i] = sc.nextInt();

        }
        System.out.println("------------------------------------------");
        System.out.println("There are " + CountEven(arr) + " even numbers in the array");
        System.out.print("The even numbers are: " );
        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
