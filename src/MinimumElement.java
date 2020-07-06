import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner=new Scanner(System.in);

    public int[] getIntegers(int capacity) {
        int[]array= new int[capacity];
        System.out.println("Enter "+ capacity+ " integer values: \r");

        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();

        }
        return array;
    }

    public int findMin(int[] array){
        int temp=0;
        for(int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
              if(array[i]>array[j]){
                  temp=array[j];
                  array[j]=array[i];
                  array[i]=temp;
              }

            }

        }
        System.out.println("The minimum element in an array is "+array[0]);
        return array[0];

    }

}
