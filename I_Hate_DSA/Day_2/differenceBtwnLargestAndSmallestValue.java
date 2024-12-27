

public class differenceBtwnLargestAndSmallestValue {
    public static void main(String[] args) {
        int[] arr = {3,2,5,2,4,7,3,2};
        int largest = arr[0];
        int smallest = arr[0];
        int Difference = 0;

        for(int i = 1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }else{
                smallest = arr[i];
            }
        }
        Difference = largest-smallest;
        
        System.out.println("Largest Value:"+largest);
        System.out.println("smallest Value:"+smallest);
        System.out.println("Difference: "+Difference);
    }
}
