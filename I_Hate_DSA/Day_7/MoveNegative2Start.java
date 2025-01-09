// 22. Move all negative numbers to beginning
// Input: [1, -3, 2, -5, 4]
// Output: [-3, -5, 1, 2, 4]


public class MoveNegative2Start {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-5,-8};
        int currentLength = arr.length;
        int valueHolder;

        for (int idx = 0; idx < currentLength; idx++) {
            if(arr[idx] >0){
                valueHolder = arr[idx];
                for(int j = idx; j<arr.length; j++){
                    if(j==arr.length-1){
                        arr[j]=valueHolder;
                    }else{
                        arr[j] = arr[j+1];
                    }
                }
                currentLength--;
            idx--;
            }
            
            
        }
        for(int element:arr){
            System.out.print(element+" ");
        }


    }
}
