

public class sumOfUltranateArrayElement {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6};
        boolean isEven = true;
        int sumOfAltranateElement = 0;

        for(int i = 0; i<arr.length;i++){
            if(isEven ==true){
                sumOfAltranateElement = sumOfAltranateElement+arr[i];
                isEven = false;
            }else{
                isEven = true;
            }

        }
        System.out.println("The sum of alranate variable is: "+sumOfAltranateElement);
    }
}
