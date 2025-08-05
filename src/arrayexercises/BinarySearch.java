package arrayexercises;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        // Create array with numbers

        int[] numbers = {5, 4, 3, 2, 1};

        // Sort elements

        Arrays.sort(numbers);

        // Method from the utility class Arrays. Basically, it searches
        // within our array for the element with value 5. If it doesn't find it,
        // it returns a negative number, so we determine that if the result is >= 0,
        // it obviously means it was found. Otherwise, it wasn't found.
        // Then we print the message depending on the case.

        if(Arrays.binarySearch(numbers, 5) >= 0) {
            System.out.println("found 5 in the list");
        } else {
            System.out.println("Didn't find!");
        }
    }
}
