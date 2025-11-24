import java.util.Scanner;

public class maximum {

    public static int[] MaximumFinder(int[] arr) {
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }
        return new int[]{maximum};
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the elements in the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
           int[] output =   maximum.MaximumFinder(arr);
        System.out.println("The maximum number is " + output[0]);


    }

}