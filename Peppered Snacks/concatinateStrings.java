public class concatinateStrings{

public static int[] concat(int[] firstArray int[] secondArray) {
    int[] newArr = new int[firstArray.length + secondArray.length];

    for (int index = 0; index < firstArray.length; index++) {
        newArr[index] = firstArray[index];
    }

    for (int index = 0; index < secondArray.length; index++) {
        newArr[firstArray.length + index] = secondArray[index];
    }

    return newArr;
}
}
