// Calculate average excluding highest and lowest values
import java.util.Scanner;
public class averageExcludingHighLowValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int length = input.nextInt();
        int[] arr = new int[length];
        // array = [2,1,4,3,7,5];

        for(int i = 0; i<length; i++){
            System.out.println("Enter the element at index "+i);
            int element = input.nextInt();
            arr[i] = element;
        }

        float sum = 0;
        float average = 0;
        int smallestValue = arr[0];
        int largestValue = arr[0];

        for(int element:arr){
            if(element>largestValue){
                largestValue = element;
            }else if(element<smallestValue){
                smallestValue = element;
            }
            sum += element;
        }
        sum = sum-(smallestValue+largestValue);
        length = length-2;
// System.out.println("Average excluding highest and lowest value is: "+average);
System.out.println("smallest value:  "+smallestValue);
System.out.println("largest value: "+largestValue);
System.out.println("sum: "+sum);
System.out.println("length: "+length);
        average = sum/length;
        System.out.println("Average excluding highest and lowest value is: "+average);
    }
}
