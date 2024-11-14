package SortableArray;

import java.util.Arrays;

public class sortablearray {

    // Feature 1: Sort an array of integers
    public void sortIntegers(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Integer Array: " + Arrays.toString(arr));
    }

    // Feature 2: Sort an array of strings
    public void sortStrings(String[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted String Array: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
    	sortablearray sortableArray = new sortablearray();

        // Testing sorting integers
        int[] intArray = {5, 3, 8, 1, 2, 4};
        sortableArray.sortIntegers(intArray);

        // Testing sorting strings
        String[] strArray = {"banana", "apple", "cherry", "date", "strawberry"};
        sortableArray.sortStrings(strArray);
    }
}
