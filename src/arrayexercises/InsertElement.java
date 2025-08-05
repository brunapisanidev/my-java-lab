package arrayexercises;

import java.util.Arrays;

// Important:This implementation does not increase the array size.
// It shifts elements to the right starting from the given index,
// but the last element is lost (overwritten) in the process.

public class InsertElement {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        shiftElement(array, 2, 999);


    }
    // The method inserts a new value at a specific index in a fixed-size array by shifting the elements to the right.
    // since the array size does not increase, the last element gets overwritten.

    public static void shiftElement(int [] array, int indexPosition, int newValue) {
        for(int i = array.length -1; i >= indexPosition; i--) {
    // It replaces the current element, e.g., array[4] = 5
    // with array[4 - 1] = 4. So after the first iteration,
    // it becomes: 1, 2, 3, 4, 4
    // on the second iteration: array[3] = array[2]
    // now it becomes: 1, 2, 3, 3, 4
    // on the third iteration: array[2] = array[1]
    // becomes: 1, 2, 2, 3, 4
    // now you can safely insert the new value at position 2
            array[i] = array[i - 1];
        }
        // Add the number here after the loop ends
        array[indexPosition] = newValue;
        // Print
        System.out.println(Arrays.toString(array));
    }

}

