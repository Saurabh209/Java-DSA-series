package JavaDsa.Day_1;
//  Write a program to reverse an integer array.(without using new array)

public class three {
    public static void main(String[] args) {
        int swaper = 0;
        
        int[] arr1 = {1,2,3,4};
        int startPointer = 0;
        int endPointer = arr1.length-1;

        while(startPointer<endPointer){
            swaper = arr1[startPointer];
            arr1[startPointer] = arr1[endPointer];
            arr1[endPointer] = swaper;

            startPointer++;
            endPointer--;
        }
        

       

        for(int i:arr1){
            
            System.out.print(i+" ");
        }
        
    }
}
