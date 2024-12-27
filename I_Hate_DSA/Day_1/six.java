// You are given an array of test scores. Calculate the average score and identify scores above the average.
public class six {
    public static void main(String[] args) {
        int[] testScore = {45,67,23,80,76};

        int averageScore = 0;
        int sumOfScore = 0;

        for(int i:testScore){
            sumOfScore+=i;
        }
        averageScore=sumOfScore/5;
        System.out.println("Average: "+averageScore);
        System.out.print("Above average: ");
        for(int i:testScore){
            if(i>averageScore){
                System.out.print(i+" ");
            }
        }
    }   
}
