import java.util.Arrays;

public class SortNumericAndStringArrays {
    public static void main(String[] args) {

        //we create an array of type int; in this case, we are already defining the elements.
        //its length will be 5.

        int[] newArray = {5, 4, 3, 2, 1};

        //we sort it using the sort method from the utility class Arrays

        Arrays.sort(newArray);

        //same idea

        String[] newArray2 = {"Blue", "Pink", "Orange", "Brown"};

        //same idea

        Arrays.sort(newArray2);

        //we use the toString method from the utility class Arrays to print the array
        System.out.println(Arrays.toString(newArray));

        //same idea
        System.out.println(Arrays.toString(newArray2));
    }
}