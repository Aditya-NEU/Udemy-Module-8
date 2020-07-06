public class Main {
    // Create a program using arrays that sorts a list of integers in descending order.
    // Descending order is highest value to lowest.
    // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
    // ultimately have an array with 106,81,26, 15, 5 in it.
    // Set up the program so that the numbers to sort are read in from the keyboard.
    // Implement the following methods - getIntegers, printArray, and sortIntegers
    // getIntegers returns an array of entered integers from keyboard
    // printArray prints out the contents of the array
    // and sortIntegers should sort the array and return a new array containing the sorted numbers
    // you will have to figure out how to copy the array elements from the passed array into a new
    // array and sort them and return the new sorted array.

    public static void main(String[] args) {

//  SortArrays sortArrays= new SortArrays();
//  int[]myIntegers= sortArrays.getIntegers(5);
//  sortArrays.sortArray(myIntegers);

/**
  -Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
 -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
 -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
 -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
 -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
 -Finally, print the minimum element in the array.

**/

MinimumElement minimumElement= new MinimumElement();
int[] integers= minimumElement.getIntegers(5);
minimumElement.findMin(integers);
    }

}
