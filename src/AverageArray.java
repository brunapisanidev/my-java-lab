public class AverageArray {

    public static void main(String[] args) {

        //create array with numbers
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        // Initialize sum variable
        int sumAll = 0;

        // Create a for loop to iterate through the array elements
        for(int i = 0; i < numbers.length; i++) {

        // Add all elements by accessing newArray[i], which returns
        // the element at the current index
        sumAll+= numbers[i];
      }
        // Create variable average, divide the sum of all elements by
        // the size of the array (remember that the array length returns the number of elements)
        double avg = sumAll/numbers.length;

        System.out.println(avg);
    }
}
