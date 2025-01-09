

public class replaceWithSquares {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        for(int idx = 0; idx<arr.length; idx++){
            arr[idx] = arr[idx]*arr[idx];
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
