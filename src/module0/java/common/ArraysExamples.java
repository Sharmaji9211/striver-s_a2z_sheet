package module0.java.common;

import java.util.Arrays;
import java.util.List;

// Arrays Class Examples
class ArraysExamples {
    public static void runExamples() {
        int[] intArray = {3, 1, 4, 1, 5};
        System.out.println("intArray: " + Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println("Sorted intArray: " + Arrays.toString(intArray));

        int[] copiedArray = Arrays.copyOf(intArray, intArray.length);
        System.out.println("Copied intArray: " + Arrays.toString(copiedArray));

        int[] newArray = Arrays.copyOfRange(intArray, 1, 4);
        System.out.println("New array (from index 1 to 4): " + Arrays.toString(newArray));

        boolean equals = Arrays.equals(intArray, copiedArray);
        System.out.println("intArray equals copiedArray: " + equals);

        Arrays.fill(intArray, 9);
        System.out.println("intArray after fill with 9: " + Arrays.toString(intArray));

        int index = Arrays.binarySearch(copiedArray, 4);
        System.out.println("searching Index of 4 in copiedArray: " + index);

        Arrays.parallelSort(copiedArray);
        System.out.println("Copied array after parallelSort: " + Arrays.toString(copiedArray));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("List created from array: " + list);

        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println("Matrix: " + Arrays.deepToString(matrix));
    }
}


