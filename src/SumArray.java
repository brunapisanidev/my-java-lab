public class SumArray {

    public static void main(String[] args) {

        //initialize sum variable

        int sumAll = 0;

        //create array with numbers

        int[] newArray = {5, 4, 3, 2, 1};

        //create a for loop to iterate through the array elements

        for (int i = 0; i < newArray.length; i++) {

        //add all elements by accessing newArray[i], which returns
        //the element at the current index

        sumAll += newArray[i];
        }

        System.out.println(sumAll);
    }
}
