
import java.util.Scanner;

public class middleElementOfArray {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter the lenght of array: ");
        int lengthOfArray = input.nextInt();
        int[] array = new int[lengthOfArray];
        System.out.println("Enter the values in array: ");

        for(int i=0; i<lengthOfArray;i++){
            int value = input.nextInt();
            array[i] = value;
        }
        System.out.print("The Array is: ");
        for(int element:array){
            System.out.print(element+" ");
        }
        System.out.println();

        if(lengthOfArray%2==0){
            System.out.print("The Middle Elements are: "+ array[(lengthOfArray/2)-1] +" , "+ array[(lengthOfArray/2)]);
        }else{
            System.out.print("The Middle Element is: "+ array[lengthOfArray/2]);
        }
    }
}
