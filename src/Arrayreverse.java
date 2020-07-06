import java.util.Scanner;

public class Arrayreverse {

    private static Scanner scanner= new Scanner(System.in);


    public int[] getIntegers(int capacity){
        int[]array = new int[capacity];
        System.out.println("Enter "+capacity+" integer values:\r");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();

        }
        System.out.println("Printing elements of array as entered: ");
        printArray(array);
        return array;
    }

    public void reverse(int[] array){

        int[] newArray= new int[array.length];
        int temp=array.length;
        for(int i=0;i<array.length;i++){
            newArray[temp-1]=array[i];
            temp=temp-1;
        }
        System.out.println("Printing array in reverse order:");

        printArray(newArray);

    }

    public void printArray(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }




}
