// Write a Java program to find the maximum element in an integer array.
package JavaDsa.Day_1;
public class one {
    public static void main(String[] args) {
        int greatestValue = 0;
        int[] arr1 = {4,3,6,5,4,7,8,3};

        for(int i:arr1){
            if(i>greatestValue){
                greatestValue=i;
            }
        }
        System.out.println("Greater value: "+greatestValue);

    }
}
