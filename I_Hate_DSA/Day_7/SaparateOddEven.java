
// 23. Separate odd and even numbers
// Input: [1, 2, 3, 4, 5]
// Output: [2, 4, 1, 3, 5]


public class SaparateOddEven {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int valueHolder;
        int arrayLength = arr.length;
        
        for(int idx = 0; idx<arrayLength; idx++){
            if(arr[idx]%2 == 0){
                valueHolder = arr[idx];
                for(int j = idx; j<arr.length; j++){
                    if(j==arr.length-1){
                        arr[j] = valueHolder;
                    }else{
                        arr[j] = arr[j+1];
                    }
                }
                arrayLength--;
                idx--;
            }
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
