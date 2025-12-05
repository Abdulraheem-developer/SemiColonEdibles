import java.util.Arrays;

public class ArrayReverse{

public static int[] ReverseArray(int[] numbers){

int [] newArray = new int[numbers.length];

  for(int index = 0; index < numbers.length; index++){
      newArray[numbers.length - 1 - index] = numbers[index];
  }

  return newArray;
}

public static void main(String[] args){

int[] numbers = {34, 65, 87, 92, 45, 78};

System.out.print(Arrays.toString(ReverseArray(numbers)));


}
}
