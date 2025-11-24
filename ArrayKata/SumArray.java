import java.util.Scanner;

public class SumArray {

    public static int[] ArraySum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return new int[]{sum};
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:  ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the elements in the array:  ");
            arr[i] = sc.nextInt();

        }
        int[] result = SumArray.ArraySum(arr);
        System.out.println("The sum of the elements of the  array is: " + result[0]);


    }
}
