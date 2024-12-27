

public class RunningSumOfArray {
    public static void main(String[] args) {
        int [] arrayOne = {2,3,8,5,7};
        int[] arrayTwo = new int[arrayOne.length];
        int runningSum = 0;

        for(int i = 0; i<arrayOne.length;i++){
            runningSum+=arrayOne[i];
            arrayTwo[i] = runningSum;
        }
        for(int element:arrayTwo){
            System.out.print(element+" ");
        }
    }
}
