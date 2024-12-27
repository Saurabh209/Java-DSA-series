// Create a method to calculate the sum of all elements in an integer array.

public class two {
    public static void main(String[] args) {
        int arrSum = 0;
        int[] arr1 = {4,3,2,5,12,22,12,19,7};

        for(int value:arr1){
            arrSum +=value;
        }
        System.out.println("sum: "+arrSum);
    }
}
