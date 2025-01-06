
//12.Find the sum of all digits in a string
import java.util.Scanner;
public class numberOfWordsInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter the string: ");
       String str = input.nextLine();
       int length = str.length();
       String num = "1234567890";
       int sum = 0;

       for(int i = 0; i<length; i++){
        if(num.contains(String.valueOf(str.charAt(i)))){
            sum += Character.getNumericValue(str.charAt(i));
            System.out.println(sum);
        }
       
    }
    System.out.println(sum);
       
    }
}
