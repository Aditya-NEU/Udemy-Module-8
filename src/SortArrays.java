import java.util.Scanner;

public class SortArrays {

    private static Scanner scanner= new Scanner(System.in);

    public int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity +" integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public void printIntegers(int[] array){

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public int[] sortArray(int[] arr){
        System.out.println("Sorting array in descending order.");
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;

                }
            }

        }
        printIntegers(arr);

        return arr;

    }

}
