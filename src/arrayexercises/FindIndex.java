package arrayexercises;

public class FindIndex {
    public static void main(String[] args) {

    // Create array with numbers

    int[] newArray = {1, 2, 3, 4, 5, 6};

    int index = findIndex(newArray, 6);

    }
    // We created this method specifically to
    // find the index of a number in the array by comparing values
    // separating this logic into its own method helps keep the code clean and organized,
    // especially as programs become more complex.

    public static int findIndex (int [] intArray, int e) {

    // Create a for loop to iterate through the array elements

    for(int i = 0; i < intArray.length; i++) {

    // If the element in the iteration (intArray[i]) is equal to the element "e" we are looking for,
    // then we found the index! This means its index is [i]

    if(intArray[i] == e) {
        System.out.println("You find the index! It's: " + i);
        return i;
           }
        }
    // If it's not found after going through all iterations, return -1
    System.out.println("I'm sorry! Not this time. ");
       return -1;
    }


}
