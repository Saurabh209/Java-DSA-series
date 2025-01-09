// 21. Shift all zeros to end of array
// Input: [1, 0, 2, 0, 3]
// Output: [1, 2, 3, 0, 0]


import java.util.Scanner;
public class Shift0TOend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int arrayLength = input.nextInt();

        int [] arr = new int[arrayLength];
        int currentLength = arrayLength;

        for(int i = 0; i<arrayLength; i++){
            System.out.println("Enter the element at index "+i);
            int ele = input.nextInt();
            arr[i] = ele;
        }

        for(int i = 0; i<currentLength; i++){
            
            if(arr[i] == 0){
                for(int j = i; j<currentLength; j++){
                    if(j == (arr.length-1)){
                        arr[j] = 0;
                        

                        
                    }else{
                        arr[j] = arr[j+1];
                        
                    }
                }
                currentLength--;
                i--;
                

            }
            
            
        }

        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
