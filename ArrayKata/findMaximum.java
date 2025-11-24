import java.util.Scanner;

public class findMaximum {

    public static int[] findMaximum(int[] arr) {
        int maximum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }

        }return new  int[]{maximum};

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items in the array");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter the numbers in the array");
            numbers[i] = sc.nextInt();

        }
        int[] maximum = findMaximum(numbers);
        System.out.println("The maximum number in the array is " + maximum);

    }
}
