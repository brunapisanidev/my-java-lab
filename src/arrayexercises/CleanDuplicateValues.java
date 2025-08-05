package arrayexercises;

import java.util.Arrays;

public class CleanDuplicateValues {
    public static void main(String[] args) {

        int[] array = {10, 10, 20, 30, 40, 50};
        int[] clean = getCleanArray(array);
        System.out.println(Arrays.toString(clean));

    }

    public static int delDuplicates(int[] array) {

        int length = array.length;
        Arrays.sort(array);

        // Outer loop
        for(int i = 0; i < length; i++) {

            // Inner loop: compares element at index i with elements at subsequent indices
            for(int j = i + 1; j < length; j++) {

                // If the duplicate number is true..
                if(array[i] == array[j]) {

                    // replace the duplicate at index j with the last element in the logical array,
                    // for example:
                    // 10, 50, 30, 40, 50
                    array[j] = array[length - 1];

                    // Without this line "length--", a silent infinite loop occurs. Why?
                    // This line reduces the logical length of the array by excluding the last element.
                    // If we don't do this, when we step back one index to compare again (see explanation for j-- below),
                    // we will compare array[1] with array[5], which in our example can be true because the "50" at the end is still included,
                    // causing the loop to repeat endlessly by stepping back over and over.
                    // Try commenting out length--, debug, and see what happens!
                    length--;

                    // Here we force the code to step back one index to re-evaluate
                    // the new value inserted at the current position before continuing
                    // with the next indices.
                    j--;

                }
            }
        }
        Arrays.sort(array);
        // The array's .length property is fixed and represents the actual size of the array.
        // It cannot be changed after the array is created.
        // We can create a separate variable called 'length' to control logical size,
        // but changing it does not affect the real array size.
        // That’s why we're going to create another method called getCleanArray(), which returns a new array
        // using Arrays.copyOf() with our custom 'length', effectively giving us a trimmed version
        // of the original array based on the logical size.
        return length;

    }

    public static int[] getCleanArray(int[] array) {
        int newLength = delDuplicates(array);
        int[] cleanArray = Arrays.copyOf(array, newLength);
        return cleanArray;
    }
}
