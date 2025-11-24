import java.util.Arrays;
import java.util.Scanner;

public class FindMinimumAndMaximum {

    public static int[] findMinimumAndMaximum(int[] arr){
        int minimum = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minimum){
                minimum = arr[i];
            }
            if (arr[i] > maximum){
                maximum = arr[i];
            }
        }

        return  new int[]{minimum, maximum};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Enter array elements: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum and maximum values are: " + Arrays.toString(findMinimumAndMaximum(arr)));


    }
}
